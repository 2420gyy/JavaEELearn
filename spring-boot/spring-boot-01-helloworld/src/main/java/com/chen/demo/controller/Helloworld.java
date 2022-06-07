package com.chen.demo.controller;

import com.chen.demo.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Helloworld {



    @RequestMapping("/hello")//问好也有中英文区分。。。。
    public String test(@RequestParam("name") String name){
        log.info("进来了。。。");
        return "hello spring boot2 "+name;
    }


    @Autowired
    Car car;//自动注入

    @RequestMapping("/car")
    public String test2(){
        return car.getBrand()+car.getPrice()+"\n"+car;
    }

}
