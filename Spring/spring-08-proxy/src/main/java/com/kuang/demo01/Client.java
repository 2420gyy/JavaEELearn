package com.kuang.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);
        //不用面对房东，直接找中介
        proxy.rent();
    }
}
