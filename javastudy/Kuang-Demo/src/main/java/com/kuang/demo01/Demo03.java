package com.kuang.demo01;

public class Demo03 {
    public static void main(String[] args) {
        int add = new Demo03().add(2, 3);
        System.out.println(add);
        Demo03 demo03 = new Demo03();
        int add1 = demo03.add(2, 4);

    }

    public int add(int a, int b) {
        return a + b;
    }
}
