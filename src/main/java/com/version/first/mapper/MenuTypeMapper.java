package com.version.first.mapper;

import com.version.first.bean.MenuType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuTypeMapper {
    void insertMenuType(@Param("menuType")MenuType menuType);
    void deleteMenuTypeByMenuTypeId(@Param("menuType")MenuType menuType);
    List<MenuType> selectAllMenuType();
}
