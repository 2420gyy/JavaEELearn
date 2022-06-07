package com.kuang.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();//获得cookie
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter writer = resp.getWriter();
        //请求里面带着cookie
        Cookie[] cookies1 = req.getCookies();
        if (cookies != null) {
            resp.getWriter().write("上次访问时间为：");
            for (int i = 0; i < cookies1.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("lastLoginTime")) {
                    //cookie.getValue();//这里是字符串啥的，长整型？？？
                    long l = Long.parseLong(cookie.getValue());
                    Date date = new Date(l);
                    resp.getWriter().write(date.toGMTString());
                }
            }
        } else {
            //这里有问题
        }
        //服务器给客户端响应一个cookie
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis() + "");
        cookie.setMaxAge(24 * 3600);
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
