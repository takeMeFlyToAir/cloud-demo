package com.zzr.cloud.controller;

import cn.hutool.core.util.RandomUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * Description 测试consul
 * Author zhaozhirong
 * Date 2020/7/12 16:43
 * Version 1.0
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul:" + serverPort + "\t"
                + RandomUtil.randomString(10);
    }

}
