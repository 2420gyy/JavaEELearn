package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//注册到容器中
@ComponentScan("com.kuang.pojo")//显式扫描
//这里有两种方法，同时写了
@Import(Myconfig2.class)
public class Myconfig {
    @Bean
    //方法名相当于bean中的id
    //返回值相当于bean中的class属性
    public User getUser() {
        return new User();

    }
}
