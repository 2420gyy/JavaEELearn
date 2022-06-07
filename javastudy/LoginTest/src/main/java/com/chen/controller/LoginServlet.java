package com.chen.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("utf-8");
//        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");//厉害！！！！！！plain都行

        User user = new User();
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        System.out.println(req.getParameter("username") + ":" + req.getParameter("password"));
        new DataAccessServlet().doGet(req, resp);

        DataAccessServlet dataAccessServlet = new DataAccessServlet();
        //System.out.println("dataAccessServlet.Yes()是"+dataAccessServlet.Yes()+"。");
        if (dataAccessServlet.Yes()) {
            resp.sendRedirect(req.getContextPath() + "/jsp/success.jsp");
        } else {
            resp.sendRedirect(req.getContextPath() + "/jsp/error.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
