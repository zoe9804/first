package com.version.first.service.Impl;

import com.version.first.bean.OrderDetails;
import com.version.first.mapper.OrderDetailsMapper;
import com.version.first.service.OrderDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderDetailsImpl implements OrderDetailsService {
    @Resource
    OrderDetailsMapper orderDetailsMapper;

    @Override
    public String addOrderDetails(OrderDetails orderDetails) {
        try {
            orderDetailsMapper.insertOrderDetails(orderDetails);
            return "success";
        } catch (Exception e) {
            return ("error:\n" + e);
        }
    }
}
