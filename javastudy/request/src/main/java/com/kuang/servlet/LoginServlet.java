package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//我的不乱码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbys = req.getParameterValues("hobbys");
        System.out.println(username);
        System.out.println(password);
        System.out.println(Arrays.toString(hobbys));

        req.setAttribute("username", username);
        req.setAttribute("password", password);
        req.setAttribute("hobbys", hobbys);

        //通过请求转发 这里不用写路径，因为login里面的路径${pageContext.request.contextPath}/login
        //得到tmocat的地址：req.getContextPath()+
        req.getRequestDispatcher("/success.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
