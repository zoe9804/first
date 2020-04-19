package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Cart;
import com.version.first.mapper.CartMapper;
import com.version.first.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartImpl implements CartService {
    @Resource
    CartMapper cartMapper;

    public ResponseWrapper addCart(Cart cart){
        Cart menuId = cartMapper.selectCartByUserIdAndMenuId(cart);
        try {
            if (menuId.getUserId() == cart.getUserId() && menuId.getMenuId() == menuId.getMenuId()) {
                int increase = cart.getMenuAmount() + menuId.getMenuAmount();
                menuId.setMenuAmount(increase);
                cartMapper.updateCartByUserIdAndMenuId(menuId);
                return ResponseWrapper.markCustom(true, "0001", "购物车已有该商品，已增加数量", null);
            } else {
                cartMapper.insertCart(cart);
                return ResponseWrapper.markCustom(false, "0000", "添加成功", null);
            }
        }catch (Exception e) {
            return ResponseWrapper.markError(e);
        }
    }

    @Override
    public List<Cart> getCartByUserId(Cart cart) {
            return cartMapper.selectCartByUserId(cart);
    }
}
