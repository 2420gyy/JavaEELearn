package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

//接口！！！！！！！！！！！
public interface UserMapper {//dao 等价于mapper

    List<User> getUserLike(String value);

    //所有的集合写里面的泛型
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //增加用户
    int addUser(User user);

    int addUser2(Map<String, Object> map);

    //修改用户
    int upDateUser(User user);//没有返回值，看下边！！！！

    void deleteUser(int id);//接口
}
