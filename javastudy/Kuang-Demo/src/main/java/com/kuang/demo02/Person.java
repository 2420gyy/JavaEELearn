package com.kuang.demo02;

public class Person {

    String name;

    public Person() {//构造器,和类名相同，每个类都有。没有返回类型，没有void
        //实例化初始值
        //使用new关键字，必须有构造器，本质调用构造器
        //this.name="qingijiag";
    }


    //有了有参构造，必须显示定义无参构造。
    public Person(String name) {
        this.name = name;
    }
}
