package com.kuang.demo01;

//类
public class Demo01 {
    //main方法
    public static void main(String[] args) {
        //System.out.println(new Demo01().sayHello("s"));
        Demo01 demo01 = new Demo01();
        String s = demo01.sayHello("ss");
        System.out.println(s);

    }

    //方法，驼峰，见名知意
    public String sayHello(String s) {
        return "hello" + s;
    }


}
