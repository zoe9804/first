package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.OrderDetails;

import java.util.List;

public interface OrderDetailsService {
    ResponseWrapper addOrderDetailsList(List<OrderDetails> orderDetailsList);
    ResponseWrapper findOrderIdByMenuId(OrderDetails orderDetails);
    ResponseWrapper addOrderRemark(OrderDetails orderDetails);
}
