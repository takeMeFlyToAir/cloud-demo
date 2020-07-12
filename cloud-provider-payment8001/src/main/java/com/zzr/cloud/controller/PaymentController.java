package com.zzr.cloud.controller;


import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Dict;
import com.zzr.cloud.entities.CommonResult;
import com.zzr.cloud.entities.Payment;
import com.zzr.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value="/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果:" + result);

        if(result > 0){
            return  new CommonResult(200,"插入数据库成功,serverPort: " + serverPort,result);
        } else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @GetMapping(value="/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果1:" + payment);

        if(payment != null){
            return  new CommonResult(200,"查询成功,serverPort: " + serverPort,payment);
        } else {
            return new CommonResult(444,"没有对应记录，查询ID: " + id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Dict getService(){
        List<String> services = discoveryClient.getServices();
        Dict dict = Dict.create();
        for (String service : services) {
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            List<Dict> dictList = CollUtil.newArrayList();
            for (ServiceInstance instance : instances) {
                Dict set = Dict.create();
                set.set("serviceId", instance.getServiceId())
                        .set("host", instance.getHost())
                        .set("port", instance.getPort())
                        .set("uri", instance.getUri());
                dictList.add(set);
            }
            dict.set(service,dictList);
        }
        return dict;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
