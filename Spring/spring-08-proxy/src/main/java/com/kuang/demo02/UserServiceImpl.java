package com.kuang.demo02;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void select() {
        System.out.println("查询了一个用户");
    }
}
