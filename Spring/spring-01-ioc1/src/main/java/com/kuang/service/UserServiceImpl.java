package com.kuang.service;

import com.kuang.pojo.UserDao;
import com.kuang.pojo.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入
    //由程序控制对象到—————>>>>>
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }//不用再写new了

    @Override
    public void getUser() {
        userDao.getUser();//业务层调dao层
    }
}
