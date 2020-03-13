package com.version.first.service.Impl;

import com.version.first.mapper.MenuTypeMapper;
import com.version.first.service.MenuTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MenuTypeImpl implements MenuTypeService {
    @Resource
    MenuTypeMapper menuTypeMapper;
}
