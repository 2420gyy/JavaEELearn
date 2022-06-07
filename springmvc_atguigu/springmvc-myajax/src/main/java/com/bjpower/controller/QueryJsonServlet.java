package com.bjpower.controller;

import com.bjpower.dao.ProvinceDao;
import com.bjpower.dao.ProvinceIn;
import com.bjpower.rntity.Province;
import com.bjpower.util.MybatisUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QueryJsonServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("收到请求");
        String json = "{}";
        String strProid = request.getParameter("bhj");

        if (strProid !=null && strProid.trim().length()>0){
            //ProvinceDao provinceDao = new ProvinceDao();
            //Province p = provinceDao.queryProviceNameById(Integer.valueOf(strProid));
            MybatisUtil util = new MybatisUtil();
            SqlSession session = util.getSqlSession();
            ProvinceIn mapper = session.getMapper(ProvinceIn.class);

            Province p = mapper.queryProById(Integer.valueOf(strProid));
            System.out.println(p);
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(p);
        }
        System.out.println(json);
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();
    }
}
