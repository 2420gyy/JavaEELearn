package com.kuang.demo01;

//引用传递，：对象，本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.names);
        Demo05.change(person);
        System.out.println(person.names);

    }

    public static void change(Person person) {
        person.names = "qingiang";
    }
}

//类，有一个属性
class Person {
    String names;
}
