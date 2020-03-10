package com.version.first.controller;

import com.version.first.bean.Deliver;
import com.version.first.service.DeliverService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DeliverController {
    @Resource
    DeliverService deliverService;
    @RequestMapping("/addDeliver")//添加配送员
    @ResponseBody
    public String AddDeliver(@RequestBody Deliver deliver){
        String result = deliverService.addDeliver(deliver);
        return result;
    }
    @RequestMapping("/getAllDeliver")//查看所有配送员
    @ResponseBody
    public List<Deliver> GetAllDeliver(){
        List<Deliver> deliverList = deliverService.getAllDeliver();
        return deliverList;
    }
}
