package com.zzr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain8006
 * Description consul作为配置中心的服务端启动类
 * Author zhaozhirong
 * Date 2020/7/11 16:43
 * Version 1.0
 **/

@SpringBootApplication
@EnableDiscoveryClient //该注解向使用consul和zookeeper作为注册中心时注册服务
public class PaymentMain8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class,args);
    }

}
