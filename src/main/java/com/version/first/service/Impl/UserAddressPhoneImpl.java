package com.version.first.service.Impl;

import com.version.first.bean.UserAddressPhone;
import com.version.first.mapper.UserAddressPhoneMapper;
import com.version.first.service.UserAddressPhoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserAddressPhoneImpl implements UserAddressPhoneService {
    @Resource
    UserAddressPhoneMapper userAddressPhoneMapper;

    @Override
    public String addUserAddressPhoneService(UserAddressPhone userAddressPhone) {
        try{
            userAddressPhoneMapper.insertUserAddressPhone(userAddressPhone);
            return "success";
        }catch (Exception e){
            return ("error:\n"+e);
        }
    }

    @Override
    public List<UserAddressPhone> getAllUserAddressPhone(UserAddressPhone userAddressPhone) {
        return userAddressPhoneMapper.selectAllByUserId(userAddressPhone);
    }

    @Override
    public UserAddressPhone updateUserAddressPhone(UserAddressPhone userAddressPhone) {
        userAddressPhoneMapper.updateUserAddressPhone(userAddressPhone);
        return userAddressPhoneMapper.selectAllById(userAddressPhone);
    }
}
