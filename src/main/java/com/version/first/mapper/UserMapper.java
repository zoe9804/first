package com.version.first.mapper;

import com.version.first.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    void insertUser(@Param("user") User user);
    User selectUserOrAdministratorByUserPhone(@Param("user")User user);
    List<User> selectAllUser();
    List<User> selectAllAdministrator();
}


