package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.MenuType;
import com.version.first.mapper.MenuTypeMapper;
import com.version.first.service.MenuTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuTypeImpl implements MenuTypeService {
    @Resource
    MenuTypeMapper menuTypeMapper;

    @Override
    public ResponseWrapper addMenuType(MenuType menuType) {
        try {
            menuTypeMapper.insertMenuType(menuType);
            return ResponseWrapper.markCustom(true,"0000","添加成功",null);
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper deleteMenuTypeByMenuTypeId(MenuType menuType) {
        try {
            menuTypeMapper.deleteMenuTypeByMenuTypeId(menuType);
            return ResponseWrapper.markCustom(true,"0000","删除成功",null);
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper getAllMenuType() {
        try {
            return ResponseWrapper.markSuccess(menuTypeMapper.selectAllMenuType());
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }

    }
}
