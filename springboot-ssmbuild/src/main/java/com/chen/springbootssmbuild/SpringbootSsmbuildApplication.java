package com.chen.springbootssmbuild;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chen.dao")
public class SpringbootSsmbuildApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmbuildApplication.class, args);
    }

}
