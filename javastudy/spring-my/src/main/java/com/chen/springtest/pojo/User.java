package com.chen.springtest.pojo;


import com.chen.springtest.dao.OutBean;

public class User {
    private String uname;
    private int age;

    private OutBean outBean;

    public void setOutBean(OutBean outBean) {
        this.outBean = outBean;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String uname) {
        this.uname = uname;
    }

    public void say(){
        System.out.println("说话");
        outBean.out();
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", outBean=" + outBean +
                '}';
    }
}
