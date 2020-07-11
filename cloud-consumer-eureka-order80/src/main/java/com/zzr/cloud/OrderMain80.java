package com.zzr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderMain80
 * Description 启动类
 * Author zhaozhirong
 * Date 2020/7/11 16:43
 * Version 1.0
 **/


@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}