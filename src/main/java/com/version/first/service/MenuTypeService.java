package com.version.first.service;

import com.version.first.bean.MenuType;

import java.util.List;

public interface MenuTypeService {
    String addMenuType(MenuType menuType);
    String deleteMenuTypeByMenuTypeId(MenuType menuType);
    List<MenuType> getAllMenuType();
}
