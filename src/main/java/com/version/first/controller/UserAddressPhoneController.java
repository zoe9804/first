package com.version.first.controller;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.UserAddressPhone;
import com.version.first.service.UserAddressPhoneService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserAddressPhoneController {
    @Resource
    UserAddressPhoneService userAddressPhoneService;

    @RequestMapping("/addUserAddressPhone")//添加收货人和地址与电话
    @ResponseBody
    public ResponseWrapper AddUserAddressPhoneService(@RequestBody UserAddressPhone userAddressPhone){
        return userAddressPhoneService.addUserAddressPhoneService(userAddressPhone);
    }

    @RequestMapping("/getAllUserAddressPhone")//查看所有相应的地址电话
    @ResponseBody
    public ResponseWrapper GetAllUserAddressPhone(@RequestBody UserAddressPhone userAddressPhone){
        return userAddressPhoneService.getAllUserAddressPhone(userAddressPhone);
    }

    @RequestMapping("/updateUserAddressPhoneById")//更改地址和联系方式
    @ResponseBody
    public ResponseWrapper UpdateUserAddressPhoneById(@RequestBody UserAddressPhone userAddressPhone){
        return userAddressPhoneService.updateUserAddressPhone(userAddressPhone);
    }

    @RequestMapping("/deleteUserAddressPhoneById")//删除地址和联系方式
    @ResponseBody
    public ResponseWrapper DeleteUserAddressPhoneById(@RequestBody UserAddressPhone userAddressPhone){
        return userAddressPhoneService.deleteUserAddressPhoneById(userAddressPhone);
    }
}
