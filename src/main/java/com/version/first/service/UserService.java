package com.version.first.service;

import com.version.first.bean.User;


public interface UserService {
    String addUser(User user);
    String userLogin(User user);
}
