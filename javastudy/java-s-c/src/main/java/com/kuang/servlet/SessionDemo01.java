package com.kuang.servlet;

import com.kuang.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");//响应回这个页面
        //得到Session
        HttpSession session = req.getSession();
        //给session存东西
        session.setAttribute("name", new Person("qingjiang", 12));
        //获取id
        String id = session.getId();
        //判断是不是新的session
        boolean aNew = session.isNew();
        if (aNew) {
            resp.getWriter().write("session创建成功，ID：" + id);
        } else {
            resp.getWriter().write("session已经创建了" + id);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
