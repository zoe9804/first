package com.version.first.service.Impl;

import com.version.first.bean.Order;
import com.version.first.bean.OrderDetails;
import com.version.first.mapper.OrderMapper;
import com.version.first.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderImpl implements OrderService{
    @Resource
    OrderMapper orderMapper;

    @Override
    public String addOrder(Order order) {
        return null;
    }

//    @Override
//    public String addOrder(Order order) {
//        orderMapper.insertOrder(order);
//        OrderDetails orderDetails;
//        orderDetails.
//
//
//
//        return null;
//    }
}
