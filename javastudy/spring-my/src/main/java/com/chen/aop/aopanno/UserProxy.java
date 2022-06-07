package com.chen.aop.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component//使用注解创建对象
@Aspect
public class UserProxy {

    @Before(value = "execution(* com.chen.aop.aopanno.User2.add(..))")
    public void before(){
        System.out.println("before.....");
    }
}
