package com.kuang.controller;

import com.kuang.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
//@ResponseBody
public class HelloController {
    //Request method 'GET' not supported 405错误
    @RequestMapping(value = "/myHello",method = RequestMethod.GET)//真实访问地址，映射地址
    public String Hello(Model model){
        //封装数据
        model.addAttribute("msg", "hello annotation");
        return "hello";//会被视图解析器处理
    }
    @RequestMapping(value = "/modelTest",method = RequestMethod.GET)
    public ModelAndView test1(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        //post 不支持
        String name = request.getParameter("name");

        modelAndView.addObject("msg","这是ModeAndView"+name);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    //@RequestParam(value = "username",required = true) 解决名称不一致的问题
    @RequestMapping("/na")
    public ModelAndView test2(@RequestParam(value = "username",required = true) String name, Integer age){
        System.out.println(name+ ": " +age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",name);//参数的字符串问题
        mv.addObject("msg2",age);
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("/ob")
    public ModelAndView test3(Student student){
        System.out.println(student);
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",student.getName());//参数的字符串问题
        mv.addObject("msg2",student.getAge());
        mv.setViewName("hello");
        return mv;
    }
    @RequestMapping(value = "/st")
    public String ReturnHello(HttpServletRequest request,String name,Integer age){
        request.setAttribute("msg",name);
        request.setAttribute("msg2",age);
//        model.addAttribute("msg", "hello annotation");
        return "hello";//会被视图解析器处理
    }
    @RequestMapping(value = "/st2")
    public String ReturnHello2(Model model,String name,Integer age){
        model.addAttribute("msg",name);
        model.addAttribute("msg2",age);
//        model.addAttribute("msg", "hello annotation");
        return "hello";//会被视图解析器处理
    }

}