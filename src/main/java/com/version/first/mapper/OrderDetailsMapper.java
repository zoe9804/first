package com.version.first.mapper;

import com.version.first.bean.OrderDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailsMapper {
    void insertOrderDetailsList(@Param("orderDetailsList")List<OrderDetails> orderDetailsList);
    List<OrderDetails> selectOrderDetailsByOrderId(@Param("orderDetailsList")List<OrderDetails> orderDetailsList);
}
