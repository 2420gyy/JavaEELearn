package com.chen.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//第一种方法
//@Component
//为了生效必须加到容器中
@ConfigurationProperties(prefix = "mycar")//和配置文件中的哪个想匹配

@Data //get set 方法
@ToString
@AllArgsConstructor//有参构造器
@NoArgsConstructor //无参构造器
public class Car {
    private String brand;
    private int price;
}
