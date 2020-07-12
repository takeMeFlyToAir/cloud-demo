package com.zzr.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * Description TODO
 * Author zhaozhirong
 * Date 2020/7/12 10:00
 * Version 1.0
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule rule(){
        return new RandomRule();
    }

}
