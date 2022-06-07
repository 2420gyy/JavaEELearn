package com.bjpower.dao;

import com.bjpower.rntity.Province;

import java.sql.*;

public class ProvinceDao {

    public Province queryProviceNameById(Integer proviceId) {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = null;

        String url = "jdbc:mysql://localhost:3306/ssmbuild";
        String password = "123456";
        String username = "root";
        String driver = "com.mysql.jdbc.Driver";

        Province province = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
            sql = "select id, name, jiancheng, shenhui from ssmbuild.provice where id=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1,proviceId);
            rs = pst.executeQuery();
            if(rs.next()){
                province = new Province();
                province.setId(rs.getInt("id"));
                province.setName(rs.getString("name"));
                province.setJiancheng(rs.getString("jiancheng"));
                province.setShenhui(rs.getString("shenhui"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                if(rs !=null){
                    rs.close();
                }
                if(pst !=null){
                    pst.close();
                }
                if(conn !=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return province;

    }
}
