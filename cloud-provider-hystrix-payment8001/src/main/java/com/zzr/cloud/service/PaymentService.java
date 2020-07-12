package com.zzr.cloud.service;


import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentServiceImpl
 * Description TODO
 * Author zhaozhirong
 * Date 2020/7/12 14:45
 * Version 1.0
 **/
public interface PaymentService {
     String paymentInfo_OK(Integer id);

    String paymentInfo_Timeout(Integer id);

    String paymentCircuitBreaker(Integer id);
}
