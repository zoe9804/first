package com.version.first.mapper;

import com.version.first.bean.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    void insertOrder(@Param("order")Order order);
    List<Order> selectOrderByUserId(@Param("order")Order order);
}
