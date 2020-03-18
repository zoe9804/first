package com.version.first.mapper;

import com.version.first.bean.OrderDetails;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailsMapper {
    void insertOrderDetails(@Param("orderDetails")OrderDetails orderDetails);
}
