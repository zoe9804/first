package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.MenuType;

import java.util.List;

public interface MenuTypeService {
    ResponseWrapper addMenuType(MenuType menuType);
    ResponseWrapper deleteMenuTypeByMenuTypeId(MenuType menuType);
    ResponseWrapper getAllMenuType();
}
