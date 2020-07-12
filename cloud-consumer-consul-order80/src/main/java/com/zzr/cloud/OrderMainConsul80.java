package com.zzr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderMainConsul80
 * Description TODO
 * Author zhaozhirong
 * Date 2020/7/12 8:25
 * Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainConsul80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsul80.class,args);
    }
}
