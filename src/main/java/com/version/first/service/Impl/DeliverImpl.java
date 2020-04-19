package com.version.first.service.Impl;

import com.version.first.Result.ResponseWrapper;
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

    public ResponseWrapper addDeliver(Deliver deliver){
        try{
            deliverMapper.insertDeliver(deliver);
            return ResponseWrapper.markSuccessButNoData();
        }catch (Exception e){
            return ResponseWrapper.markError(e);
        }
    }

    public ResponseWrapper getAllDeliver(){
        try {
            return ResponseWrapper.markSuccess(deliverMapper.selectAllDeliver());
        }catch (Exception e) {
            return ResponseWrapper.markError(e);
        }
    }
}
