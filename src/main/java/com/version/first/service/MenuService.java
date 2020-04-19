package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Menu;


public interface MenuService {
    ResponseWrapper addMenu(Menu menu);
    ResponseWrapper getMenuTypeId(Menu menu);
    ResponseWrapper findMenuByFuzzyQueryMenuName(Menu menu);
    ResponseWrapper deleteMenuByName(Menu menu);
    ResponseWrapper changeMenuByMenuId(Menu menu);
}
