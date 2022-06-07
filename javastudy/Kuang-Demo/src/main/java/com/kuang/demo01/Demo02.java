package com.kuang.demo01;

public class Demo02 {
    public static void main(String[] args) {

        //静态方法，可以Student.say();

        //非静态方法 ---实例化
        Student student = new Student();
        student.say();

    }

    //static 和类一起加载
    public void a() {
        b();
    }

    public void b() {

    }
}
