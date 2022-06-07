package com.atguigu.mvc.handler;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.entity.Student;
import com.atguigu.crowd.util.CrowdUtil;
import com.atguigu.crowd.util.ResultEntity;
import com.atguigu.service.api.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.PublicKey;
import java.util.List;

@Controller
public class TestHandler {

    @Autowired
    private AdminService adminService;
    private Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @ResponseBody
    @RequestMapping("/send/compose/object.json")
    public ResultEntity<Student> testReceiveComposeObject(@RequestBody Student student,HttpServletRequest request){
        boolean judgeResult =  CrowdUtil.judgeRequestType(request);
        logger.info("===============================judgeResult=========================="+judgeResult);
        logger.info(student.toString());

        return ResultEntity.successWithData(student);
    }


    @ResponseBody
    @RequestMapping("send/array.html")
    public String testReceiveArrayOne(@RequestBody List<Integer> array){

        for(Integer number:array){
            logger.info("number="+number);
        }
//        array.forEach(System.out::println);
        return "success";
    }

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap, HttpServletRequest request){
        boolean judgeResult =  CrowdUtil.judgeRequestType(request);
        logger.info("===============================judgeResult=========================="+judgeResult);
        List<Admin> adminList = adminService.getAll();

        modelMap.addAttribute("adminList",adminList);
//        System.out.println(10/0);

        return "target";
    }
}
