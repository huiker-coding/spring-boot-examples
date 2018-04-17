package com.example.demo.controller;

import com.example.demo.biz.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/12.
 */

@RestController
public class TestController {
    @Autowired
    private Sender sender;

    @RequestMapping("/test")
    public String test() {
        for(int i=0;i<100000;i++){
            sender.sendMsg("hello rabbitmq!!");
        }
        return "success!!";
    }

}
