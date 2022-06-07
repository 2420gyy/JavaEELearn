package com.kuang.demo02;

import java.net.UnknownServiceException;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //userService.add();
        //代理 真实角色不变，不在原有代码上改变东西
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();

    }
}
