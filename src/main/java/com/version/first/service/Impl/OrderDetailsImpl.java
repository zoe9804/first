package com.version.first.service.Impl;

import com.version.first.mapper.OrderDetailsMapper;
import com.version.first.service.OrderDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderDetailsImpl implements OrderDetailsService {
    @Resource
    OrderDetailsMapper orderDetailsMapper;
}
