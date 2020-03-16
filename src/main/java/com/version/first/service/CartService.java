package com.version.first.service;

import com.version.first.bean.Cart;

import java.util.List;

public interface CartService {
    String addCart(Cart cart);
    List<Cart> getCartByUserId(Cart cart);
}
