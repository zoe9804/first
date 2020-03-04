package com.version.first.service.Impl;

import com.version.first.bean.Deliver;
import com.version.first.mapper.DeliverMapper;
import com.version.first.service.DeliverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeliverImpl implements DeliverService {
    @Resource
    DeliverMapper deliverMapper;

    public String addDeliver(Deliver deliver){
        try{
            deliverMapper.insertDeliver(deliver);
            return "success";
        }catch (Exception e){
            return ("error:\n"+e);
        }
    }

    public List<Deliver> getAllDeliver(){
        return deliverMapper.selectAllDeliver();
    }
}
