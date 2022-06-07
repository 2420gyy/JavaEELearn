package com.kuang.demo02;

public class UserServiceProxy implements UserService {
    //接口--重写方法
    private UserServiceImpl userService;

    //私有 --
    //使用set方法注入？？？
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    //          public UserServiceProxy() {
//    }
    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("add");
        userService.delete();
    }

    @Override
    public void select() {
        log("add");
        userService.select();
    }

    //提升作用域？？ 日志方法
    public void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
