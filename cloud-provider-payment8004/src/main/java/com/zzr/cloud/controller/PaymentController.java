package com.zzr.cloud.controller;

import cn.hutool.core.util.RandomUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * Description 测试zk
 * Author zhaozhirong
 * Date 2020/7/11 16:43
 * Version 1.0
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper:" + serverPort + "\t"
                + RandomUtil.randomString(10);
    }

}
