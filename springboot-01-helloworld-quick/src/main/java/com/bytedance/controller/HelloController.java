package com.bytedance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author doubleBear
 * @create 2020 06 11 22:28
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello quick";
    }

}
