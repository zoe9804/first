package com.version.first.service.Impl;

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

    public String addCart(Cart cart){
        Cart menuId = cartMapper.selectCartByUserIdAndMenuId(cart);
        if (menuId.getUserId()==cart.getUserId()&&menuId.getMenuId()==menuId.getMenuId()){
            int increase = cart.getMenuAmount()+menuId.getMenuAmount();
            menuId.setMenuAmount(increase);
            cartMapper.updateCartByUserIdAndMenuId(menuId);
            return "增加数量成功";
        }else {
            cartMapper.insertCart(cart);
            return "新添加购物车成功";
        }
    }

    @Override
    public List<Cart> getCartByUserId(Cart cart) {
        return cartMapper.selectCartByUserId(cart);
    }
}
