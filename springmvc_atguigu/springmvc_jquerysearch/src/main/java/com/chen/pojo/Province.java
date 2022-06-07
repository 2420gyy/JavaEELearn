package com.chen.pojo;

public class Province {
    private int id;
    private String name;
    private String jiancheng;
    private String shenhui;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJiancheng() {
        return jiancheng;
    }

    public void setJiancheng(String jiancheng) {
        this.jiancheng = jiancheng;
    }

    public String getShenhui() {
        return shenhui;
    }

    public void setShenhui(String shenhui) {
        this.shenhui = shenhui;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jiancheng='" + jiancheng + '\'' +
                ", shenhui='" + shenhui + '\'' +
                '}';
    }
}
