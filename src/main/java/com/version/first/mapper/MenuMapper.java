package com.version.first.mapper;

import com.version.first.bean.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    void insertMenu(@Param("menu")Menu menu);
    List<Menu> selectMenuByTypeId(@Param("menu")Menu menu);
    List<Menu> selectMenuByFuzzyQurryMenuName(@Param("menu")Menu menu);
}
