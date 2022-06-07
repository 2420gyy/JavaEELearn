package com.atguigu.factory;

import com.kuang.pojo.User;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<User> {//实现接口可以做工厂bean

    //定义和返回的类型可以不一样
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("abc");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
