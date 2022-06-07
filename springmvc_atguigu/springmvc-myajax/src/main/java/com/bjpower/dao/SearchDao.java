package com.bjpower.dao;

import java.sql.*;

public class SearchDao {

    public String queryProviceById(Integer proviceId) {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = null;
        String name ="";

        String url = "jdbc:mysql://localhost:3306/ssmbuild";
        String password = "123456";
        String username = "root";
        String driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
            sql = "select name from ssmbuild.provice where id=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1,proviceId);
            rs = pst.executeQuery();
            while(rs.next()){
                name = rs.getString("name");

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
        return name;

    }
}
