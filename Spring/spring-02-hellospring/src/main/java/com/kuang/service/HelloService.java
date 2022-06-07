package com.kuang.service;

import com.kuang.pojo.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloService {

//    @Autowired
//    private Hello hello;
//
//    public void setHello(Hello hello) {
//        this.hello = hello;
//    }

    @Bean(name = "hello")
    public Hello sayhello(){
        Hello hello = new Hello();
        hello.setStr("你好");
        return hello;
    }
}
