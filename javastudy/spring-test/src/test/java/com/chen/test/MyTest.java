package com.chen.test;

import com.chen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = context.getBean("user", User.class);
        //System.out.println(user.toString());
        Date mydate = context.getBean("mydate", Date.class);
        System.out.println(mydate);

    }
}
