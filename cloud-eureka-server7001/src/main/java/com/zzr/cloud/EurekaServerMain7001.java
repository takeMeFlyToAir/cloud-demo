package com.zzr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerMain7001
 * Description 启动类
 * Author zhaozhirong
 * Date 2020/7/11 16:43
 * Version 1.0
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain7001.class,args);
    }

}
