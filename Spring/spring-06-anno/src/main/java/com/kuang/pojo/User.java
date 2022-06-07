package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//组件，相当于 <bean id="user" class="com.kuang.pojo.User"/>
@Component
@Scope("")//prototype singleton
public class User {
    //相当于 <property name = "name" value="kuangs"/>
    @Value("kuangs")
    public String name;
}
