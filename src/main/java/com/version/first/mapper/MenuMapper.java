package com.version.first.mapper;

import com.version.first.bean.Menu;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    void insertMenu(@Param("menu")Menu menu);
}
