package com.chen.annotation;

import org.springframework.stereotype.Component;

//不写默认类首字母小写
@Component(value = "userService")//等价bean中的id
//- dao （@Repository）
//- service（@Service）
//- controller（@Controller）
public class UserService {

    public void add(){
        System.out.println("注解annotation");
    }
}
