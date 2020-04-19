package com.version.first.service;

import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Deliver;

import java.util.List;

public interface DeliverService {
    ResponseWrapper addDeliver(Deliver deliver);
    ResponseWrapper getAllDeliver();
}
