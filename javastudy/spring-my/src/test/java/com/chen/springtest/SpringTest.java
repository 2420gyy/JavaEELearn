package com.chen.springtest;

import com.chen.annotation.UserService;
import com.chen.annotation.config.SpringConfig;
import com.chen.aop.aopanno.User2;

import com.chen.autowire.Emp;
import com.chen.springtest.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
        user.say();
    }
    @Test
    public void test_autowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_autowire.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.toString());
        emp.test();
    }
    @Test
    public void test_annotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_annotation.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void test_ann_congfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void test_aop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_aop.xml");
        User2 user2 = context.getBean("ser2", User2.class);
        user2.add();
    }


}
