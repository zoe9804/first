package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Menu;
import com.version.first.mapper.MenuMapper;
import com.version.first.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MenuImpl implements MenuService {
    @Resource
    MenuMapper menuMapper;

    @Override
    public ResponseWrapper addMenu(Menu menu) {
        try{
            menuMapper.insertMenu(menu);
            return ResponseWrapper.markSuccessButNoData();
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper getMenuTypeId(Menu menu) {
        menu.setPage((menu.getPage()-1)*10);
        try {
            return ResponseWrapper.markSuccess(menuMapper.selectMenuByTypeId(menu));
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }

    }

    @Override
    public ResponseWrapper findMenuByFuzzyQueryMenuName(Menu menu) {
        try {
            return ResponseWrapper.markSuccess(menuMapper.selectMenuByFuzzyQueryMenuName(menu));
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper deleteMenuByName(Menu menu) {
        try {
            menuMapper.deleteMenuByName(menu);
            return ResponseWrapper.markSuccessButNoData();
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper changeMenuByMenuId(Menu menu){
        try {
            menuMapper.updateMenuByMenuId(menu);
            return ResponseWrapper.markSuccessButNoData();
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper addMenuPictureByMenuId(Menu menu){
//        try {
            menuMapper.insertMenuPictureByMenuId(menu);
            return ResponseWrapper.markSuccessButNoData();
//        }catch (Exception e){
//            return ResponseWrapper.markError(e);
//        }
    }
}
