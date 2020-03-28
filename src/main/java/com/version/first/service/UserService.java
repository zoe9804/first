package com.version.first.service;

import com.version.first.bean.User;

import java.util.List;


public interface UserService {
    String addUser(User user);
    String userLogin(User user);
    String addAdministrator(User user);
    List<User> FindALlUser();
    List<User> FindALlAdministrator();
    User findUserOrAdministratorByPhone(User user);
}
