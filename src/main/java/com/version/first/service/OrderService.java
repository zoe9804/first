package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Order;

import java.util.List;

public interface OrderService {
    ResponseWrapper addOrder(Order order);
    ResponseWrapper findOrderByUserId(Order order);
    ResponseWrapper findOrderByUserIdAndOrderId(Order order);
    ResponseWrapper changeOrderStateToDelivering(Order order);
    ResponseWrapper changeOrderStateToDelivered(Order order);
}
