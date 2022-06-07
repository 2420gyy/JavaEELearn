package com.chen.config;


import com.chen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//# 作为配置类，替代xml文件
@ComponentScan(basePackages = {"com.chen.pojo"})//扫描包？，位置
//这几个位置怎么搞得。。。
public class SpringConfig {
    @Bean
    public void sleep() {//默认调用了一次？？？？
        System.out.println("还不学习");
    }

    @Bean//#
    public User getUser() {
        return new User();
    }

}
