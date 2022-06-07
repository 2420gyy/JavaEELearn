package com.shang.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    //get和post只是请求实现的不同方式，可以互相调用，业务逻辑都一样
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入doGet方法");
        PrintWriter writer = resp.getWriter();//响应流
        writer.println("Hello,serlvet!!!");
        resp.setContentType("text/html");//响应类型
        resp.setCharacterEncoding("utf-8");
        //获取响应的输出流
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Wor</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello world!</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
