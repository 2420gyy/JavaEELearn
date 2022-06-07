package com.atguigu.service;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;

public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add.........");
        userDao.updata();

        //互相调用的普通方法：
        //UserDao userDao = new UserDaoImpl();//多态？
        //userDao.updata();
    }
}
