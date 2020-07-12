package com.zzr.cloud.service;

import com.zzr.cloud.entities.CommonResult;
import com.zzr.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentFeignService
 * Description TODO
 * Author zhaozhirong
 * Date 2020/7/12 11:10
 * Version 1.0
 **/

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value="/payment/get/{id}")
     CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
