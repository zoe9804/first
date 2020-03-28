package com.version.first.service.Impl;

import com.version.first.bean.Order;
import com.version.first.bean.OrderDetails;
import com.version.first.mapper.OrderDetailsMapper;
import com.version.first.mapper.OrderMapper;
import com.version.first.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class OrderImpl implements OrderService{
    @Resource
    OrderMapper orderMapper;

    @Resource
    OrderDetailsMapper orderDetailsMapper;

    @Override
    public String addOrder(Order order) {
            try {
                orderMapper.insertOrder(order);
                List<OrderDetails> orderDetailsList= order.getOrderDetails();
                orderDetailsMapper.insertOrderDetailsList(orderDetailsList);
                return "order success";
            }catch (Exception e){
                return "order error";
            }
    }

    @Override
    public List<Order> findOrderByUserId(Order order) {
        return orderMapper.selectOrderByUserId(order);
    }

    @Override
    public List<Order> findOrderRemarkByMenuName(Order order) {
        return null;
    }


}
