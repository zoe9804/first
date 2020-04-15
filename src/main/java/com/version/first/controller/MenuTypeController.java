package com.version.first.controller;

import com.version.first.bean.MenuType;
import com.version.first.service.MenuTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuTypeController {
    @Resource
    MenuTypeService menuTypeService;

    @RequestMapping("/addMenuType")//增加菜品的种类
    @ResponseBody
    public String AddMenuType(@RequestBody MenuType menuType){
        return menuTypeService.addMenuType(menuType);
    }
    @RequestMapping("/getAllMenuType")//查看菜品种类
    @ResponseBody
    public List<MenuType> GetAllMenuType(){
        return menuTypeService.getAllMenuType();
    }

    @RequestMapping("/deleteMenuTypeByMenuTypeId") //删除菜品种类
    @ResponseBody
    public String DeleteMenuTypeByMenuTypeId(@RequestBody MenuType menuType){
        return menuTypeService.deleteMenuTypeByMenuTypeId(menuType);
    }

}
