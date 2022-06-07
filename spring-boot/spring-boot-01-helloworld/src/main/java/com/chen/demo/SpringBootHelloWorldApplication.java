package com.chen.demo;

import ch.qos.logback.core.db.DBHelper;
import com.chen.demo.bean.Person;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.chen.demo")
public class SpringBootHelloWorldApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootHelloWorldApplication.class, args);
        //Person bean = run.getBean(Person.class);
        //System.out.println(bean);//NoUniqueBeanDefinitionException ??????
        System.out.println("========================");
        String[] beanNamesForType = run.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);

        boolean tom = run.containsBean("tom");//是否有tom组件
        boolean person01 = run.containsBean("person01");//是否有tom组件
        System.out.println("tom组件"+tom);
        System.out.println("person01组件"+person01);
        System.out.println("=================");
        boolean haha = run.containsBean("haha");
        System.out.println("haha是否注入"+haha);

    }
}
