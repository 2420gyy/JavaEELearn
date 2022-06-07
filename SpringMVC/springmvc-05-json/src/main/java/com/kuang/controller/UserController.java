package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController //不走视图解析器
public class UserController {

    //可以统一配置value = "/j1",produces = "application/json;charset=utf-8"
    @RequestMapping("/j1")
    @ResponseBody //不会走视图解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User(1, "秦疆", 3);
        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();
        User user1 = new User(1, "秦疆", 3);
        User user2 = new User(2, "秦疆", 3);
        User user3 = new User(3, "秦疆", 3);
        User user4 = new User(4, "秦疆", 3);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String str = mapper.writeValueAsString(userList);

        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {

        Date date = new Date();
        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j4")
    public String json4() {

        List<User> userList2 = new ArrayList<User>();
        User user1 = new User(1, "秦疆", 3);
        User user2 = new User(2, "秦疆", 3);
        User user3 = new User(3, "秦疆", 3);
        User user4 = new User(4, "秦疆", 3);
        userList2.add(user1);
        userList2.add(user2);
        userList2.add(user3);
        userList2.add(user4);

        String s = JSON.toJSONString(userList2);
        return s;
    }

}
