package com.atgui.admin.controller;


import com.atgui.admin.bean.City;
import com.atgui.admin.bean.User;
import com.atgui.admin.service.CityService;
import com.atgui.admin.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    JdbcTemplate jdbcTemplate;

//    注入的是接口而不是实现类!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @Autowired
    CityService cityService;

//    P64 11:30~
//    接口上的@Mapper替代写法
    @ResponseBody
    @PostMapping("/savecity")
    public City insertCity(City city){
        cityService.insertCity(city);
        return city;
    }
    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
       return cityService.getCityById(id);
    }


    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from student");
        return mapList.toString();
    }


//    搞清这个login加不加/的问题
    @GetMapping(value = {"/","login"})
    public String loginPage(){
        return "login";
    }

    //@RequestMapping(value = "/login",method = RequestMethod.POST)
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && "123".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
//        登录成功重定向到main.html
        return "redirect:/main.html";
    }

//    表单重复提交的解决办法
//    处理的请求名叫main.html
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
//        是否登录，拦截器，过滤器
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser!=null){
            return "main";
        }else {
//            回到登录页
            model.addAttribute("msg", "请重新登录");
            return "login";
        }
    }
    @GetMapping("/main_alt.html")
    public String main_altPage(){
        return "main_alt";
    }
}