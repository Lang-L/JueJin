package com.juejin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Double_L
 * @Create 2021/6/18 19:22
 * @Description
 */
@RestController
public class MyController {
    @RequestMapping("/request")
    public String request(String method){
        return "request";
    }

    @PostMapping("/post")
    public String post(String method){
        return "post";
    }

    @GetMapping("/get")
    public String get(String method){
        return "get";
    }
}
