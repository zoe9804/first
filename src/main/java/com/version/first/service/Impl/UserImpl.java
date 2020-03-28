package com.version.first.service.Impl;

import com.version.first.bean.User;
import com.version.first.mapper.UserMapper;
import com.version.first.service.UserService;
import org.springframework.stereotype.Service;
import java.lang.String;
import java.util.List;

import javax.annotation.Resource;

@Service
public class UserImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public String addUser(User user) {
        try {
            userMapper.insertUser(user);
            return "success";
        } catch (Exception e) {
            return ("error:\n" + e);
        }
    }

    @Override
    public String userLogin(User user){
        User password = userMapper.selectUserOrAdministratorByUserPhone(user);
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

    @Override
    public String addAdministrator(User user) {
        try {
            user.setUserIdentity(1);
            userMapper.insertUser(user);
            return "success";
        } catch (Exception e) {
            return ("error:\n" + e);
        }
    }

    @Override
    public List<User> FindALlUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<User> FindALlAdministrator() {
        return userMapper.selectAllAdministrator();
    }

    @Override
    public User findUserOrAdministratorByPhone(User user) {
        return userMapper.selectUserOrAdministratorByUserPhone(user);
    }
}


