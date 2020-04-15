package com.version.first.service;

import com.version.first.bean.Order;

import java.util.List;

public interface OrderService {
    String addOrder(Order order);
    List<Order> findOrderByUserId(Order order);
    Order findOrderByUserIdAndOrderId(Order order);
    String changeOrderStateToDelivering(Order order);
    String changeOrderStateToDelivered(Order order);
//    List<Order> findOrderRemarkByMenuName(Order order);
}
