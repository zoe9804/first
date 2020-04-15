package com.version.first.service.Impl;

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
    public String addMenuType(MenuType menuType) {
        try {
            menuTypeMapper.insertMenuType(menuType);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    @Override
    public String deleteMenuTypeByMenuTypeId(MenuType menuType) {
        try {
            menuTypeMapper.deleteMenuTypeByMenuTypeId(menuType);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }

    @Override
    public List<MenuType> getAllMenuType() {
        return menuTypeMapper.selectAllMenuType();
    }
}
