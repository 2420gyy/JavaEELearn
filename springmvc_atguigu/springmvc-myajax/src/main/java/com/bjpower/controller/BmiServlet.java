package com.bjpower.controller;

import java.io.IOException;

public class BmiServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //接受请求参数
        String name = request.getParameter("name");
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");

        float h = Float.valueOf(height);
        float w = Float.valueOf(weight);
        float bmi = w / (h * h);

        String msg = name+"的bmi为:"+bmi;
        //把数据存入到request
        request.setAttribute("msg",msg);
        //转发到新的页面
        request.getRequestDispatcher("/request.jsp").forward(request,response);
    }
}
