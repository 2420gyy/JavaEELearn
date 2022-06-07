package com.kuang.demo01;

public class Proxy implements Rent {//组合优先于继承原则
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        fare();
        host.rent();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //收费
    public void fare() {
        System.out.println("中介收费");
    }
}
