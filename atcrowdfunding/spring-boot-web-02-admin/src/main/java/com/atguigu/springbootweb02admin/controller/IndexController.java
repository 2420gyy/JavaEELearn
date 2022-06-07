package com.atguigu.springbootweb02admin.controller;

import com.atguigu.springbootweb02admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping(value = {"/","login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && "1234".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
//        登录成功重定向到main.html
        return "redirect:/main.html";
    }

//    表单重复提交的解决办法
//    处理的请求名叫main.html
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
//        是否登录，拦截器，过滤器
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser!=null){
            return "main";
        }else {
//            回到登录页
            model.addAttribute("msg","请重新登录");
            return "login";
        }


    }
}
