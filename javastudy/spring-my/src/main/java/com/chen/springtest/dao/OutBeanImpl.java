package com.chen.springtest.dao;


import com.chen.springtest.dao.OutBean;

public class OutBeanImpl implements OutBean {

    @Override
    public void out() {
        System.out.println("外部bean");
    }
}
