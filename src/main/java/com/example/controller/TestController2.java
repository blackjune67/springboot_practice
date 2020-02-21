package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController2 {
    @RequestMapping("/hello")
    public String run() {
        return "안녕하세요";
    }
}
