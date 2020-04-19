package com.version.first.controller;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Menu;
import com.version.first.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    @Resource
    MenuService menuService;

    @RequestMapping("/addMenu")//后台添加菜品
    @ResponseBody
    public ResponseWrapper AddMenu(@RequestBody Menu menu){
        return menuService.addMenu(menu);
    }

    @RequestMapping("/getMenuByTypeId")//首页根据TypeId显示菜品
    @ResponseBody
    public ResponseWrapper GetMenuTypeId(@RequestBody Menu menu){
        return menuService.getMenuTypeId(menu);
    }

    @RequestMapping("/findMenuByFuzzyQueryMenuName")//模糊查询菜品
    @ResponseBody
    public ResponseWrapper FindMenuByFuzzyQueryMenuName(@RequestBody Menu menu){
        return menuService.findMenuByFuzzyQueryMenuName(menu);
    }

    @RequestMapping("/deleteMenuByName")//后台删除菜品
    @ResponseBody
    public ResponseWrapper DeleteMenuByName(@RequestBody Menu menu){
        return menuService.deleteMenuByName(menu);
    }

    @RequestMapping("/changeMenuByMenuId")//后台修改菜品
    @ResponseBody
    public ResponseWrapper changeMenuByMenuId(@RequestBody Menu menu){
        return menuService.changeMenuByMenuId(menu);
    }
}
