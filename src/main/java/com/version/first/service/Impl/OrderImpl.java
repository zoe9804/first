package com.version.first.service.Impl;

import com.version.first.bean.Order;
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
            try {
                orderMapper.insertOrder(order);
                return "order success";
            }catch (Exception e){
                return "order error";
            }

    }


}
