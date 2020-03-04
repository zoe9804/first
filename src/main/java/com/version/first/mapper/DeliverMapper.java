package com.version.first.mapper;

import com.version.first.bean.Deliver;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliverMapper {
    void insertDeliver(@Param("deliver")Deliver deliver);
    List<Deliver> selectAllDeliver();

}
