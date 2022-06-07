package com.kuang.demo02;

public class Application {
    public static void main(String[] args) {

        //构造器--存在空的方法
        Person person = new Person("kkk");

        System.out.println(person.name);


        //类 抽象的，要实例化
        //类实例化后，会返回一个自己的对象
        //具体实例
        Student student_xaiomin = new Student();
        Student student_xiaohong = new Student();
        student_xaiomin.age = 10;

        student_xaiomin.name = "xaiomin";

        student_xaiomin.study();

        System.out.println(student_xaiomin.age);
    }
}
