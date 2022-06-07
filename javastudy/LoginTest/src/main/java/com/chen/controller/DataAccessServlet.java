package com.chen.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class DataAccessServlet extends HttpServlet {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/chapter01?serverTimezone=UTC&characterEncoding=UTF-8&useSSL=false";
    private static final String name = "root"; //账号
    private static final String pwd = "123456"; //密码
    private static boolean flag = false;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        resp.setContentType("text/html;charset=utf-8");
        User user = new User();
        String un = user.getUsername();
        String pw = user.getPassword();
        System.out.println(un + "::" + pw);
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL, name, pwd);
            stmt = conn.createStatement();
            String sql;
            sql = "select * from userinfo where username = ? and password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);//预编译???????
            pstmt.setString(1, un); //设置第一个？的值
            pstmt.setString(2, pw); //设置第二个？的值
            ResultSet st = pstmt.executeQuery();
            if (st.next()) {//这里为什么进不来？？？？//顺序呀！！！
                flag = true;
                System.out.println("设置flag为true成功...");
            }
//            while (st.next()){
//                String name = st.getString("username");
//                System.out.println("查询后de"+name);
//                String pwdword = st.getString("password");
//                System.out.println(pwdword);
//                //flag = true;
//            }

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


        //这里写注册的东西。。。。


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    boolean Yes() {
        return flag;
    }
}


