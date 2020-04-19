package com.version.first.controller;

import com.version.first.Result.ResponseWrapper;
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
    public ResponseWrapper AddUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping("/userLogin")//用户登陆
    @ResponseBody
    public ResponseWrapper userLogin(@RequestBody User user){
        return userService.userLogin(user);
    }

    @RequestMapping("/addAdministrator")//添加管理员
    @ResponseBody
    public ResponseWrapper AddAdministrator(@RequestBody User user){
        return userService.addAdministrator(user);
    }

    @RequestMapping("/findAllUser")//查看所有用户
    @ResponseBody
    public ResponseWrapper FindAllUser(){
        return userService.FindALlUser();
    }

    @RequestMapping("/findUserOrAdministratorByPhone")//通过phone查找用户
    @ResponseBody
    public ResponseWrapper FindUserOrAdministratorByPhone(@RequestBody User user){
        return userService.findUserOrAdministratorByPhone(user);
    }

    @RequestMapping("/findAllAdministrator")//查看所有用户
    @ResponseBody
    public ResponseWrapper FindAllAdministrator(){
        return userService.FindALlAdministrator();
    }
}

