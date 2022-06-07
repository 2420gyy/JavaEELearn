package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@ResponseBody
public class HelloController {
    @RequestMapping("/myhello")//真实访问地址，映射地址
    public String Hello(Model model){
        //封装数据
        model.addAttribute("msg", "hello annotation");
        return "hello";//会被视图解析器处理
    }
}
