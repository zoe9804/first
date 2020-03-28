package com.version.first.controller;

import com.version.first.bean.Order;
import com.version.first.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    OrderService orderService;

    @RequestMapping("/addOrder")//提交订单
    @ResponseBody
    public String AddOrder(@RequestBody Order order){
        return orderService.addOrder(order);

    }

    @RequestMapping("/findOrderByUserId")//查看订单
    @ResponseBody
    public List<Order> FindOrderByUserId(@RequestBody Order order){
        return orderService.findOrderByUserId(order);
    }
    @RequestMapping("/findOrderRemarkByMenuName")//所有评价
    @ResponseBody
    public List<Order> FindOrderRemarkByMenuName(@RequestBody Order order){
        return orderService.findOrderRemarkByMenuName(order);
    }
}
