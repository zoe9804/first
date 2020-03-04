package com.version.first.service;

import com.version.first.bean.Deliver;

import java.util.List;

public interface DeliverService {
    String addDeliver(Deliver deliver);
    List<Deliver> getAllDeliver();
}
