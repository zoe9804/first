package com.version.first.service.Impl;

import com.version.first.bean.Menu;
import com.version.first.mapper.MenuMapper;
import com.version.first.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class MenuImpl implements MenuService {
    @Resource
    MenuMapper menuMapper;

    @Override
    public String addMenu(Menu menu) {
        try{
            menuMapper.insertMenu(menu);
            return "success";
        }catch (Exception e){
            return ("error:\n"+e);
        }
    }
}
