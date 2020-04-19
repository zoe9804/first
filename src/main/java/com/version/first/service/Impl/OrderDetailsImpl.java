package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
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
    public ResponseWrapper addOrderDetailsList(List<OrderDetails> orderDetailsList) {
        try {
            orderDetailsMapper.insertOrderDetailsList(orderDetailsList);
            return ResponseWrapper.markCustom(true,"0000","添加成功",null);
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }

    }

    @Override
    public ResponseWrapper findOrderIdByMenuId(OrderDetails orderDetails) {
        try {
            return ResponseWrapper.markCustom(true,"0000","查询成功",orderDetailsMapper.selectOrderIdByMenuId(orderDetails));
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }

    }


}
