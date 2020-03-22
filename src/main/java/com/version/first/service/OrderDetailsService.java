package com.version.first.service;

import com.version.first.bean.OrderDetails;

import java.util.List;

public interface OrderDetailsService {
    String addOrderDetailsList(List<OrderDetails> orderDetailsList);
}
