package com.version.first.service;

import com.version.first.bean.UserAddressPhone;

import java.util.List;

public interface UserAddressPhoneService {
    String addUserAddressPhoneService(UserAddressPhone userAddressPhone);
    List<UserAddressPhone> getAllUserAddressPhone(UserAddressPhone userAddressPhone);
    UserAddressPhone updateUserAddressPhone(UserAddressPhone userAddressPhone);
}
