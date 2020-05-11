package com.version.first.mapper;

import com.version.first.bean.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    void insertMenu(@Param("menu")Menu menu);
    List<Menu> selectMenuByTypeId(@Param("menu")Menu menu);
    List<Menu> selectMenuByFuzzyQueryMenuName(@Param("menu")Menu menu);
    void deleteMenuByName(@Param("menu")Menu menu);
    void updateMenuByMenuId(@Param("menu")Menu menu);
    void insertMenuPictureByMenuId(@Param("menu")Menu menu);
}
