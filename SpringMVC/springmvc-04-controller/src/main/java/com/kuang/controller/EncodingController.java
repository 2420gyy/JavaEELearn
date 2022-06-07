package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EncodingController {
    @PostMapping("/e/t1")
    public String test1(@RequestParam("name") String name, Model model) {
        model.addAttribute("msg", name);
        return "admin/test";
    }
}
