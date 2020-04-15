package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.User;

import java.util.List;


public interface UserService {
    ResponseWrapper addUser(User user);
    ResponseWrapper userLogin(User user);
    ResponseWrapper addAdministrator(User user);
    ResponseWrapper FindALlUser();
    ResponseWrapper FindALlAdministrator();
    ResponseWrapper findUserOrAdministratorByPhone(User user);
}
