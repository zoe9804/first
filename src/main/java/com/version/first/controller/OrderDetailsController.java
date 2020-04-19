package com.version.first.controller;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Order;
import com.version.first.bean.OrderDetails;
import com.version.first.service.OrderDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderDetailsController {
    @Resource
    OrderDetailsService orderDetailsService;

    @RequestMapping("/addOrderDetailsList")//添加订单明细
    @ResponseBody
    public ResponseWrapper AddOrderDetailsList(@RequestBody List<OrderDetails> list){
        return orderDetailsService.addOrderDetailsList(list);
    }

    @RequestMapping("/findOrderIdByMenuIdAndUser")//根据一个菜名查找该菜品的评价及评价人
    @ResponseBody
    public ResponseWrapper FindOrderIdByMenuId(@RequestBody OrderDetails orderDetails){
        return orderDetailsService.findOrderIdByMenuId(orderDetails);
    }

}
