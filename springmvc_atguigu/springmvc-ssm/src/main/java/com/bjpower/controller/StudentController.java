package com.bjpower.controller;

import com.bjpower.pojo.Student;
import com.bjpower.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addStudent")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int i = studentService.addStudent(student);
        if (i>0){
            tips = "学生["+student.getName()+"]注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }




}
