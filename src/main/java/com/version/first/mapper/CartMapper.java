package com.version.first.mapper;

import com.version.first.bean.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    void insertCart(@Param("cart")Cart cart);
    List<Cart> selectCartByUserId(@Param("cart")Cart cart);
    Cart selectCartByUserIdAndMenuId(@Param("cart")Cart cart);
    void updateCartByUserIdAndMenuId(@Param("cart")Cart cart);
    void deleteCartByUserIdAndMenuId(@Param("cart")Cart cart);

}
