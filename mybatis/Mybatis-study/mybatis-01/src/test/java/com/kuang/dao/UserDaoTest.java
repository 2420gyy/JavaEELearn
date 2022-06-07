package com.kuang.dao;


import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        //第一步，获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步，执行sql
        //方式一：getMapper
        UserMapper userMapper1 = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper1.getUserList();
        for (User user : userList) {//userlist.for 快捷方式
            System.out.println(user);//sout 同上
        }
        //关闭sqlsession
        sqlSession.close();
    }

    @Test
    public void getUserLike() {
        //第一步，获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步，执行sql
        //方式一：getMapper
        UserMapper userMapper1 = sqlSession.getMapper(UserMapper.class);
        List<User> userLike = userMapper1.getUserLike("%李%");
        for (User user : userLike) {
            System.out.println(user);//sout 同上
        }
        //关闭sqlsession
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        //获取执行sql的对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//增删改需要提交事务
        int res = mapper.addUser(new User(5, "呜呜", "23333", 21));
        if (res > 0) System.out.println("插入成功");
//提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//增删改需要提交事务
        HashMap<String, Object> map = new HashMap<>();
        map.put("idnum", 4);
        map.put("passward", "123333");
        map.put("age", 22);
        mapper.addUser2(map);

//提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void upDateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.upDateUser(new User(4, "呵呵", "1234", 19));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void othertest(){
        SqlSession session = MybatisUtils.getSqlSession();
        //sqlId = namespace + . + id
        //Mapped Statements collection does not contain value for com.kuang.pojo.User.getUserById
        String sqlId = "com.kuang.dao.UserMapper"+"."+"getUserById";
        User user = session.selectOne(sqlId,1);
        System.out.println("动力节点，使用mybatis查询一个用户："+user);

        session.commit();
        session.close();
    }

}
