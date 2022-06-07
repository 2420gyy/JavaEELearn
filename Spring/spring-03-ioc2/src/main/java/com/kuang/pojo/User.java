package com.kuang.pojo;

public class User {
    private String name;
    private int age;

    //    public  User(){//无参构造，隐视的,没有有参构造就默认存在
//        System.out.println("User的无参构造！");
//    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
    }
}
