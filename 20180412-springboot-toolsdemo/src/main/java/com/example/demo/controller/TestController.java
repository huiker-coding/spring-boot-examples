package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  zh
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        for(int i=0;i<1000;i++){

        }

        return "hello docker!!";
    }

}
