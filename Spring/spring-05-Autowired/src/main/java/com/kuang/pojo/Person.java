package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    //@Resource(name = "cat") 先找名字，再找类型  ----jdk内置，没了？？？
    @Autowired //相当于byType ，不用set了 类型相同byName
    @Qualifier(value = "cat1")
    private Cat cat;
    @Autowired
    private Dog dog;
    //@Nullable 字段标志的注解，说明这个字段可以为null ？？？？？
//    @Qualifier(value = "dog111")//指定唯一的bean注入  指定一个唯一的id对象
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
