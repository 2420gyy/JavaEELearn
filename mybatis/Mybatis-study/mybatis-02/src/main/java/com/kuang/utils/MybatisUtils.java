package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.*;

//sqlSessionFactory -->sqlSession
//工具类
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;//提升作用域

    static {
        try {
            //使用mybatis第一步，获取SqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//去掉类型声明
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //return  sqlSession;
        return sqlSessionFactory.openSession();
    }


}
