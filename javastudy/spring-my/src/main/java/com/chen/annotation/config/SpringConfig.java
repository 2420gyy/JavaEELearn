package com.chen.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//配置类
@ComponentScan(basePackages = {"com.chen.annotation"})
//数组形式，等价<context:component-scan base-package="com.chen.annotation" 。。。
public class SpringConfig {
}
