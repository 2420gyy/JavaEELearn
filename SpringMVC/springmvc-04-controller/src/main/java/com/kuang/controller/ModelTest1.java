package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        System.out.println(session.getId());
        response.sendRedirect("/index.jsp");//有问题。。

        //return "admin/test";
    }

    public void test2(HttpServletRequest request, HttpServletResponse response) {
        //转发怎么搞？？？，项目路径一塌糊涂。。。
        request.setAttribute("msg", "");
    }
}
