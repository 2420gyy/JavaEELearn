package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContrlooerTest {

    @RequestMapping("/t2")
    public String test(Model model) {
        model.addAttribute("msg", "Controller annotation");

        return "admin/test";
    }

    @RequestMapping("/t3")
    public String test2(Model model) {
        model.addAttribute("msg", "Controller annotation3");

        return "admin/test";//test页面被复用
    }
}
