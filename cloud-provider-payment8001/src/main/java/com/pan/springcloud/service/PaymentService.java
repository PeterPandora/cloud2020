package com.pan.springcloud.service;

import com.pan.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 潘聪
 * @description
 * @date 2021/2/24 21:57
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
