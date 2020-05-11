package com.version.first.controller;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Cart;
import com.version.first.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CartController {
    @Resource
    CartService cartService;

    @RequestMapping("/addCart")//添加购物车
    @ResponseBody
    public ResponseWrapper AddCart(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }

    @RequestMapping("/getUserCart")//通过userId在cart和menu中获取数据
    @ResponseBody
    public ResponseWrapper GetUserCart(@RequestBody Cart cart){
        Map<String,Object> cartMap=new HashMap<>();
        List<Cart> cartList = cartService.getCartByUserId(cart);
        cartMap.put("cart",cartList);
        return ResponseWrapper.markSuccess(cartMap);
    }

    @RequestMapping("/deleteCartByUserIdAndMenuId")//根据userId和MenuId删除购物车
    @ResponseBody
    public ResponseWrapper DeleteCartByUserIdAndMenuId(@RequestBody Cart cart){
        return cartService.deleteCartByUserIdAndMenuId(cart);
    }
}
