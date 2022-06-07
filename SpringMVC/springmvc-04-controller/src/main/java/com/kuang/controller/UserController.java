package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    //不写这个注解也会跳转，但是结果为空，所以为了规范。必须加上（一样也要加）
    public String test1(@RequestParam("username") String name, Model model) {
        //接收前端参数
        System.out.println("前端参数为" + name);
        //返回的结果返回给前端
        model.addAttribute("msg", name);
        //跳转视图
        return "admin/test";
    }

    //前端接受一个对象
    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user);
        return "admin/test";

    }

    // 通过Model传递数据，modelandview基础不会。。。
    @GetMapping("/t3")
    public String test3(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("age") int age, Model model) {
        model.addAttribute("mi", id);
        model.addAttribute("mn", name);
        model.addAttribute("ma", age);
        return "admin/test";
    }
}
