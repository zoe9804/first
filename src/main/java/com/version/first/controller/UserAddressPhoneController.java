package com.version.first.controller;

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
    public String AddUserAddressPhoneService(@RequestBody UserAddressPhone userAddressPhone){
        String result = userAddressPhoneService.addUserAddressPhoneService(userAddressPhone);
        return result;
    }

    @RequestMapping("/getAllUserAddressPhone")//查看所有相应的地址电话
    @ResponseBody
    public List<UserAddressPhone> GetAllUserAddressPhone(@RequestBody UserAddressPhone userAddressPhone){
        List<UserAddressPhone> userAddressPhoneList = userAddressPhoneService.getAllUserAddressPhone(userAddressPhone);
        return userAddressPhoneList;
    }

    @RequestMapping("/updateUserAddressPhoneById")//更改地址和联系方式
    @ResponseBody
    public UserAddressPhone UpdateUserAddressPhoneById(@RequestBody UserAddressPhone userAddressPhone){
        return userAddressPhoneService.updateUserAddressPhone(userAddressPhone);
    }
}
