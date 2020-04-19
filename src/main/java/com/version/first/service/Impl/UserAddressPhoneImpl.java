package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
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
    public ResponseWrapper addUserAddressPhoneService(UserAddressPhone userAddressPhone) {
        try {
            userAddressPhoneMapper.insertUserAddressPhone(userAddressPhone);
            return ResponseWrapper.markCustom(true,"0000","添加成功", null);
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper getAllUserAddressPhone(UserAddressPhone userAddressPhone) {
        try {
            return ResponseWrapper.markCustom(true,"0000","查询成功",
                    userAddressPhoneMapper.selectAllByUserId(userAddressPhone));
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper updateUserAddressPhone(UserAddressPhone userAddressPhone) {
        try {
            userAddressPhoneMapper.updateUserAddressPhone(userAddressPhone);
            return ResponseWrapper.markCustom(true,"0000","更新成功",
                    userAddressPhoneMapper.selectAllById(userAddressPhone));
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public ResponseWrapper deleteUserAddressPhoneById(UserAddressPhone userAddressPhone) {
        try{
            userAddressPhoneMapper.deleteUserAddressPhone(userAddressPhone);
            return ResponseWrapper.markCustom(true,"0000","删除成功", null);
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }
}
