package com.zzr.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * Description TODO
 * Author zhaozhirong
 * Date 2020/7/12 15:40
 * Version 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
