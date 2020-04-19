package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.UserAddressPhone;

import java.util.List;

public interface UserAddressPhoneService {
    ResponseWrapper addUserAddressPhoneService(UserAddressPhone userAddressPhone);
    ResponseWrapper getAllUserAddressPhone(UserAddressPhone userAddressPhone);
    ResponseWrapper updateUserAddressPhone(UserAddressPhone userAddressPhone);
    ResponseWrapper deleteUserAddressPhoneById(UserAddressPhone userAddressPhone);
}
