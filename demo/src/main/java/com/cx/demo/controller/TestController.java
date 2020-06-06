package com.cx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("demo")
    @ResponseBody
    public String TESTone() {

        return "hello world";
    }
}
