package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        //接收前端的请求代码写在这里
        //1.获取前端请求 /hello?method=add
        String method = req.getParameter("method");
        if (method.equals("add")) {
            resp.getWriter().println("网页");

            req.getSession().setAttribute("msg", "执行了add方法");
        }
        if (method.equals("delete")) {
            req.getSession().setAttribute("msg", "执行了delete方法");
        }
        //2.调用业务层
        //3.视图转发或者重定向
        //保证安全，用户不可见，放到web-inf下面
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp); //转发
//        resp.sendRedirect();重定向
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
