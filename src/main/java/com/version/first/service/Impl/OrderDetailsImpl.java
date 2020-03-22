package com.version.first.service.Impl;

import com.version.first.bean.OrderDetails;
import com.version.first.mapper.OrderDetailsMapper;
import com.version.first.service.OrderDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderDetailsImpl implements OrderDetailsService {
    @Resource
    OrderDetailsMapper orderDetailsMapper;


    @Override
    public String addOrderDetailsList(List<OrderDetails> orderDetailsList) {
        try {
            orderDetailsMapper.insertOrderDetailsList(orderDetailsList);
            return "orderDetailsList success";
        }catch (Exception e){
            return "orderDetailsList error";
        }

    }
}
