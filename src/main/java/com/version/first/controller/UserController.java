package com.version.first.controller;

import com.version.first.bean.User;
import com.version.first.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/addUser")//用户注册
    @ResponseBody
    public String AddUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping("/userLogin")//用户登陆
    @ResponseBody
    public String userLogin(@RequestBody User user){
        return userService.userLogin(user);

    }

}

