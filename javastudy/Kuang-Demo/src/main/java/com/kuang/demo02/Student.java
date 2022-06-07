package com.kuang.demo02;

//学生类 抽象概念
//类--组织代码 对象--封装数据
public class Student {
    String name;
    int age;

    public void study() {
        System.out.println(this.name + " are studying");
    }
}
