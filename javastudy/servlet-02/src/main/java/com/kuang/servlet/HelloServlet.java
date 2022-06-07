package com.kuang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //init---  this.getInitParameter(); 初始化参数
        //context---  this.getServletConfig(); servlet配置
        //this.getServletContext();Servler上下文对象
        ServletContext servletContext = this.getServletContext();
        //请求转发 servletContext.getRequestDispatcher("").forward();
        String username = "秦疆";
        servletContext.setAttribute("username", username);//将数据存在上下文中

    }
}
