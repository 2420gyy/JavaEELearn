package com.chen.controller;

import com.chen.pojo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping("/returnajax")
    public void returnAjax(HttpServletResponse response,String name, Integer age) throws IOException {
        System.out.println(name+"   "+age);
        Student student = new Student();
        student.setAge(age);
        student.setName(name);

        //把对象转为json 添加注解
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(student);
        System.out.println(s);

        //输出json，响应ajax
//        @RequestBody 把student转换后的json通过HttpServletResponse对象输出给浏览器
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println(s);
        writer.flush();
        writer.close();
    }

//    控制器方法返回student--json
    //找到实现类MappingJackson2HttpMessageConverter,执行write()方法
    @RequestMapping("/doajaxjson")
    @ResponseBody
    public Student doAjaxJson(String name,Integer age){
        System.out.println("控制器方法返回自定义对象student，转为json"+name+"=="+age);
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }
    @RequestMapping("/doajaxjsonarray")
    @ResponseBody
    public List<Student> doAjaxJsonArray(String name,Integer age){
        System.out.println("控制器方法返回自定义对象student，转为json"+name+"=="+age);
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(20);
        Student student1 = new Student();
        student1.setName("lisi");
        student1.setAge(22);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);

        return studentList;
    }
    //有ResponseBody ——》 数据
    //没有返回的就是视图
    //解决中文乱码问题(文本的默认编码是ISO-8859-1的) produces = "text/plain;charset=UTF-8"
    @RequestMapping(value = "/dostring",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String doString(){

        return "hello 返回了字符串";
    }
}
