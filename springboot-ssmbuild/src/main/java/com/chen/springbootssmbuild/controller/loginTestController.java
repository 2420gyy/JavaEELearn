package com.chen.springbootssmbuild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginTestController {
//    @RequestMapping("/login")
    public String toLogin(){
        return "login";      //找到resources下的static下的haha.html
    }
}
