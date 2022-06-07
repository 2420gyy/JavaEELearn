package com.chen.utile;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Utile {

    public static SqlSessionFactory sqlSessionFactory;

    static {
        String re = "mybatis-config.xml";
        try {
            InputStream is = Resources.getResourceAsStream(re);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSessionFactory() {
        return sqlSessionFactory.openSession();
    }
    public void getOne(){
        System.out.println("fangfa");
    }
}
