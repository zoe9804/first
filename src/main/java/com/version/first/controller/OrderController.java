package com.version.first.controller;

import com.version.first.Result.ResponseWrapper;
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
    public ResponseWrapper AddOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @RequestMapping("/findOrderByUserId")//查看订单
    @ResponseBody
    public ResponseWrapper FindOrderByUserId(@RequestBody Order order){
        return orderService.findOrderByUserId(order);
    }

    @RequestMapping("/findOrderByUserIdAddOrderId")//用户查看订单详情
    @ResponseBody
    public ResponseWrapper FindOrderByUserIdAddOrderId(@RequestBody Order order){
        return orderService.findOrderByUserIdAndOrderId(order);
    }

    @RequestMapping("/changeOrderStateToDelivering")//将订单状态修改为正在配送
    @ResponseBody
    public ResponseWrapper ChangeOrderStateToDelivering(@RequestBody Order order){
        return orderService.changeOrderStateToDelivering(order);
    }

    @RequestMapping("/changeOrderStateToDelivered")//将订单状态修改为已送达
    @ResponseBody
    public ResponseWrapper ChangeOrderStateToDelivered(@RequestBody Order order){
        return orderService.changeOrderStateToDelivered(order);
    }
}
