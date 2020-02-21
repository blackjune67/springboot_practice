package com.example.service.impl;

import com.example.dao.MainMapper;
import com.example.domain.UserVO;
import com.example.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


@Service
@Validated
@EnableAutoConfiguration
public class MainServiceImpl implements MainService {

    @Autowired
    MainMapper mainMapper;

    @Override
    @Valid
    public UserVO getUserVO() {
        return mainMapper.getUserVo();
    }
}
