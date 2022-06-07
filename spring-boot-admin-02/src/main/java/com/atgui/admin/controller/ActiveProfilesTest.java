package com.atgui.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActiveProfilesTest {


    @Value("${person.name:lisi}")
    private String name;
    @ResponseBody
    @GetMapping("/profilesTest")
    public String test1(){
        return "test:"+name;
    }
}
