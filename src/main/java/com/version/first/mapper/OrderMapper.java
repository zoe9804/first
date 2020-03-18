package com.version.first.mapper;

import com.version.first.bean.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    void insertOrder(@Param("order")Order order);
}
