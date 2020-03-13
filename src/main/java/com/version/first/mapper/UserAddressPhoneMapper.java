package com.version.first.mapper;


import com.version.first.bean.UserAddressPhone;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAddressPhoneMapper {
    void insertUserAddressPhone(@Param("userAddressPhone") UserAddressPhone userAddressPhone);
    List<UserAddressPhone> selectAllByUserId(@Param("userAddressPhone")UserAddressPhone userAddressPhone);
    void deleteUserAddressPhone(@Param("userAddressPhone")UserAddressPhone userAddressPhone);
    void updateUserAddressPhone(@Param("userAddressPhone")UserAddressPhone userAddressPhone);
    UserAddressPhone selectAllById(@Param("userAddressPhone")UserAddressPhone userAddressPhone);
}
