package com.kuang.demo04;

public class Student {
    //属性 私有
    //提供一些操作的方法
    //get 获得这个数据
    //set 给这个数据设置值

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

}
