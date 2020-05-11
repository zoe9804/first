package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Cart;
import com.version.first.bean.Order;
import com.version.first.bean.OrderDetails;
import com.version.first.mapper.CartMapper;
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

    @Resource
    CartMapper cartMapper;

    @Override
    public ResponseWrapper addOrder(Order order) {
//        Cart cart=null;
//        cart.setUserId(order.getUserId());
        //插入一条order和多条orderDetails,删除购物车中的相关记录
//        try {
            orderMapper.insertOrder(order);
            List<OrderDetails> orderDetailsList = order.getOrderDetails();
            orderDetailsMapper.insertOrderDetailsList(orderDetailsList);
//            for (OrderDetails orderDetails : orderDetailsList) {
//                cart.setMenuId(orderDetails.getMenuId());
//                cartMapper.deleteCartByUserIdAndMenuId(cart);
//            }
            return ResponseWrapper.markCustom(true,"0000","添加订单成功",null);
//        }catch (Exception e){
//            return ResponseWrapper.markError(e);
//        }
    }

    @Override
    public ResponseWrapper findOrderByUserId(Order order) {
        List<Order> orderList= orderMapper.selectOrderByUserId(order);
        try {
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
            return ResponseWrapper.markCustom(true,"0000","查找成功",orderList);
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper findOrderByUserIdAndOrderId(Order order) {
        Order order1 = orderMapper.selectOrderByUserIdAndOrderId(order);
        try {
            switch (order1.getOrderState()) {
                case "0":
                    order1.setOrderState("正在准备");
                    break;
                case "1":
                    order1.setOrderState("正在配送");
                    break;
                case "2":
                    order1.setOrderState("已送达");
                    break;
                default:
                    order1.setOrderState("已完成");
            }
            switch (order1.getPayId()) {
                case "1":
                    order1.setPayId("支付宝");
                    break;
                case "2":
                    order1.setPayId("微信");
                    break;
                case "3":
                    order1.setPayId("货到付款");
                    break;
            }
            return ResponseWrapper.markCustom(true,"0000","查找成功",order1);
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper changeOrderStateToDelivering(Order order) {
        try {
            orderMapper.updateOrderStateToDelivering(order);
            return ResponseWrapper.markSuccessButNoData();
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper changeOrderStateToDelivered(Order order) {
        try {
            orderMapper.updateOrderStateToDelivered(order);
            return ResponseWrapper.markSuccessButNoData();
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }
}
