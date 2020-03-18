package com.version.first.controller;

import com.version.first.bean.OrderDetails;
import com.version.first.service.OrderDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class OrderDetailsController {
    @Resource
    OrderDetailsService orderDetailsService;

    @RequestMapping("/addOrderDetails")//增加订单明细
    @ResponseBody
    public String AddOrderDetails(@RequestBody OrderDetails orderDetails){
        return orderDetailsService.addOrderDetails(orderDetails);
    }
}
