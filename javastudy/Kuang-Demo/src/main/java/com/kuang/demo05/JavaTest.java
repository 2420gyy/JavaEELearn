package com.kuang.demo05;

public class JavaTest {
    public static void main(String[] args) {
        Person aa = new Person();
        Person bb = new Person();

        System.out.println(aa == bb);

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(a == 100);
        System.out.println(c == d);
        System.out.println(c == 200);
    }
}
