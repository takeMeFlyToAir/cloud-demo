package com.zzr.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderController
 * Description TODO
 * Author zhaozhirong
 * Date 2020/7/11 17:27
 * Version 1.0
 **/

@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/zk")
    public String paymentZk(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }

}
