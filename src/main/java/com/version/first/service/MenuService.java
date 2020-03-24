package com.version.first.service;

import com.version.first.bean.Menu;

import java.util.List;

public interface MenuService {
    String addMenu(Menu menu);
    List<Menu> getMenuTypeId(Menu menu);
    List<Menu> findMenuByFuzzyQueryMenuName(Menu menu);
}
