package com.kuang.demo01;

//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        Demo04.change(a);//
        System.out.println(a);
    }

    //返回值为空
    public static void change(int a) {
        a = 10;
    }
}
