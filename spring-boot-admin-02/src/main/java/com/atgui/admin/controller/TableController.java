package com.atgui.admin.controller;

import com.atgui.admin.bean.User;
import com.atgui.admin.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TableController {
    @Autowired
    UserService userService;

//    [[${session.loginUser.userName}]]
    @GetMapping("/basic_table")
//    @RequestParam("a") int a
    public String basic_table(){
//        自定义异常处理器：P55
//        int i=10/0;
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
//      向表中动态的添加数据
        //数据类型<集合存储的数据类型> 变量名 = new 数据类型<集合存储的数据类型>();
//        ArrayList<User> info = new ArrayList<User>(){{
//            add(new User("zhangsan","123456"));
//
//            add(new User("lisi","123444"));
//            add(new User("lisi1","123444"));
//            add(new User("lisi2","123444"));
//            add(new User("lisi3","123444"));
//            }};
//        model.addAttribute("users",info);

//        将user表展示，模糊查询，分页
//        controller调用service ，service调用mapper
        List<User> list = userService.list();
//        model.addAttribute("users",list);

//        当前第几页，传入pn
        Page<User> userPage = new Page<>(pn, 2);
//        分页查询的结果
        Page<User> page = userService.page(userPage, null);
        model.addAttribute("page",page);


        return "table/dynamic_table";
    }
//这里传参数的形式？？？前端：@{/delete(id=${user.id})} 风格问题
    @RequestMapping("/delete")
    public String delete(Long id) {
        userService.removeById(id);
//        userService.
        return "redirect:/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }



}
