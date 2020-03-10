package com.version.first.service.Impl;

import com.version.first.bean.User;
import com.version.first.mapper.UserMapper;
import com.version.first.service.UserService;
import org.springframework.stereotype.Service;
import java.lang.String;

import javax.annotation.Resource;

@Service
public class UserImpl implements UserService {
    @Resource
    UserMapper userMapper;

    public String addUser(User user) {
        try {
            userMapper.insertUser(user);
            return "success";
        } catch (Exception e) {
            return ("error:\n" + e);
        }
    }

    public String userLogin(User user){
        User password = userMapper.selectUserByUserPhone(user);
        if(password != null){
            if (password.getUserPassword().equals(user.getUserPassword())){
                return "success";
            }else {
                return "password wrong" ;
            }
        }else {
            return "user not exist";
        }
    }

}


