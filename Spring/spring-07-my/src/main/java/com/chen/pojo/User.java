package com.chen.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    //使用@Qualifier(value = "dog")去配合使用，指定一个唯一的id对象
//    @Qualifier(value = "张三")
    @Value("张三")
    private String name;
    @Autowired
    @Value("23")
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void test() {
        System.out.println("pojo中的test方法");
    }
}
