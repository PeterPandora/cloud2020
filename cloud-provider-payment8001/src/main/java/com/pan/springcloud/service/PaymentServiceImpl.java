package com.pan.springcloud.service;

import com.pan.springcloud.dao.PaymentDao;
import com.pan.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 潘聪
 * @description
 * @date 2021/2/24 21:58
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
