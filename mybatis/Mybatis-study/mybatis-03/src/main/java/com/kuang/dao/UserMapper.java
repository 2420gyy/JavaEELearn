package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

//接口！！！！！！！！！！！
public interface UserMapper {//dao 等价于mapper

    //所有的集合写里面的泛型
    //查询全部用户
    List<User> getUserList();

    List<User> getUserByLimit(Map<String, Integer> map);

    //根据ID查询用户
    User getUserById(int id);

}
