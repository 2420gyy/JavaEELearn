package com.atgui.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.atgui.admin.mapper")
@ServletComponentScan(basePackages = "com.atgui.admin")
@SpringBootApplication(exclude = RedisAutoConfiguration.class)
public class SpringBootAdmin02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdmin02Application.class, args);
    }

}
