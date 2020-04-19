package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Cart;

import java.util.List;

public interface CartService {
    ResponseWrapper addCart(Cart cart);
    List<Cart> getCartByUserId(Cart cart);
}
