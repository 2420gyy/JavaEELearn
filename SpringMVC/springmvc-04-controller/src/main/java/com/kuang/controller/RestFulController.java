package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    //http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
    //restful风格:http://localhost:8080/springmvc_04_controller_war_exploded/add/a/b
    //@GetMapping @PostMapping @PutMapping @DeleteMapping @PatchMapping

    //@RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String test(@PathVariable(required = false) int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);


        return "admin/test";
    }
}
