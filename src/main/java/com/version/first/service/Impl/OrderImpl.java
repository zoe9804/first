package com.version.first.service.Impl;

import com.version.first.mapper.OrderMapper;
import com.version.first.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderImpl implements OrderService{
    @Resource
    OrderMapper orderMapper;
}
