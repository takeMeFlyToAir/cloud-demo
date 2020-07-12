package com.zzr.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationConfig
 * Description TODO
 * Author zhaozhirong
 * Date 2020/7/11 16:43
 * Version 1.0
 **/

@Configuration
public class ApplicationConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
