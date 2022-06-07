package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ModelTest2 {
    @RequestMapping("m2/t2")
    public String test2(Model model) {
        model.addAttribute("msg", "ModelTest2");
        //浏览器的url不变：转发，可以加forward声明
        return "forward:/WEB-INF/a.jsp";//视图解析器的作用。！。！。
    }

    @RequestMapping("m3/t3")
    public String test3(Model model) {
        model.addAttribute("msg", "ModelTest3");
        //重定向
        return "redirect:/index.jsp";
    }
}
