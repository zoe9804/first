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
            List<OrderDetails> orderDetailsList = order.getOrderDetails();
            orderDetailsMapper.insertOrderDetailsList(orderDetailsList);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    @Override
    public List<Order> findOrderByUserId(Order order) {
        List<Order> orderList= orderMapper.selectOrderByUserId(order);
        for (Order value : orderList) {
            switch (value.getOrderState()) {
                case "0":
                    value.setOrderState("正在准备");
                    break;
                case "1":
                    value.setOrderState("正在配送");
                    break;
                case "2":
                    value.setOrderState("已送达");
                    break;
                default:
                    value.setOrderState("已完成");
            }
            switch (value.getPayId()) {
                case "1":
                    value.setPayId("支付宝");
                    break;
                case "2":
                    value.setPayId("微信");
                    break;
                case "3":
                    value.setPayId("货到付款");
                    break;
            }
        }
        return orderList;
    }

    @Override
    public Order findOrderByUserIdAndOrderId(Order order) {
        Order order1 = orderMapper.selectOrderByUserIdAndOrderId(order);
        switch (order1.getOrderState()){
            case "0":order1.setOrderState("正在准备");break;
            case "1":order1.setOrderState("正在配送");break;
            case "2":order1.setOrderState("已送达");break;
            default :order1.setOrderState("已完成");
        }
        switch(order1.getPayId()){
            case "1":order1.setPayId("支付宝");break;
            case "2":order1.setPayId("微信");break;
            case "3":order1.setPayId("货到付款");break;
        }
        return order1;
    }

    @Override
    public String changeOrderStateToDelivering(Order order) {
        try {
            orderMapper.updateOrderStateToDelivering(order);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    @Override
    public String changeOrderStateToDelivered(Order order) {
        try {
            orderMapper.updateOrderStateToDelivered(order);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }
}
