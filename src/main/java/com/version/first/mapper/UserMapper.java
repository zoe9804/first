package com.version.first.mapper;

import com.version.first.bean.User;
import org.apache.ibatis.annotations.Param;



public interface UserMapper {
    void insertUser(@Param("user") User user);
    User selectUserByUserPhone(@Param("user")User user);
}


