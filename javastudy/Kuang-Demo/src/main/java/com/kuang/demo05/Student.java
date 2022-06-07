package com.kuang.demo05;

public class Student extends Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.say();
        student.aa();
        new Student().aa();
    }

    public void aa() {
        this.say();
    }

}
