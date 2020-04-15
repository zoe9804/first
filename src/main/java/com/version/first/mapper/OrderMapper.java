package com.version.first.mapper;

import com.version.first.bean.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    void insertOrder(@Param("order")Order order);
    List<Order> selectOrderByUserId(@Param("order")Order order);
    Order selectOrderByUserIdAndOrderId(@Param("order")Order order);
    void updateOrderStateToDelivering(@Param("order")Order order);
    void updateOrderStateToDelivered(@Param("order")Order order);

//  List<Order> selectOrderRemarkByMenuName(@Param("order")Order order);
}
