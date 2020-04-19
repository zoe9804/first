package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.User;
import com.version.first.mapper.UserMapper;
import com.version.first.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public ResponseWrapper addUser(User user) {
        if(userMapper.selectUserOrAdministratorByUserPhone(user)==null){
            try {
                userMapper.insertUser(user);
                return ResponseWrapper.markCustom(true,"0000","注册成功",null);
            } catch (Exception e) {
                return ResponseWrapper.markCustom(false,"0003","出现异常",e);
            }
        }
        else{
            return ResponseWrapper.markCustom(false,"0004","用户已存在",null);
        }

    }

    @Override
    public ResponseWrapper userLogin(User user){
        User password = userMapper.selectUserOrAdministratorByUserPhone(user);
        if(password != null){
            if (password.getUserPassword().equals(user.getUserPassword())){
                return ResponseWrapper.markCustom(true,"0000","登陆成功",password.getUserId());
            }else {
                return ResponseWrapper.markCustom(false,"0001","密码错误",null);
            }
        }else {
            return ResponseWrapper.markCustom(false,"0002","用户不存在",null);
        }
    }

    @Override
    public ResponseWrapper addAdministrator(User user) {
        try {
            user.setUserIdentity(1);
            userMapper.insertUser(user);
            return ResponseWrapper.markCustom(true,"0000","添加成功",null);
        } catch (Exception e) {
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper FindALlUser() {
        try {
            return ResponseWrapper.markCustom(true, "0000", "查找全部用户成功", userMapper.selectAllUser());
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper FindALlAdministrator() {
        try {
            return ResponseWrapper.markCustom(true, "0000", "查找全部管理员成功", userMapper.selectAllAdministrator());
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper findUserOrAdministratorByPhone(User user) {
        try {
            return ResponseWrapper.markCustom(true,"0001","error",userMapper.selectUserOrAdministratorByUserPhone(user));
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }
}


