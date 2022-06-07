package com.atguigu.springboot;

import com.atguigu.springboot.pojo.Dog;
import com.atguigu.springboot.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("helloService");//判断ioc容器中是否包含这个bean

        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person.toString());
    }

}
