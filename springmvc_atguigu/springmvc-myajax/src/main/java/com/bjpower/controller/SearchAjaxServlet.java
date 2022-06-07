package com.bjpower.controller;

import com.bjpower.dao.SearchDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//重写方法 ctrl + O
public class SearchAjaxServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String strBh = request.getParameter("bh");
        System.out.println(strBh);
        //访问dao
        String name="请输入数字";
        //判断非空字符串
        if(strBh!=null && !"".equals(strBh.trim())){
            SearchDao dao = new SearchDao();
            name = dao.queryProviceById(Integer.valueOf(strBh));
        }
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println(name);
        pw.flush();
        pw.close();

    }
}
