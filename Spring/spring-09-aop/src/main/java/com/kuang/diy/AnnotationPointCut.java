package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//使用注解实现aop

@Aspect//标注类为切面
@Component
public class AnnotationPointCut {

    //注意导入的包---aspectj
    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")//切入点
    public void before() {
        System.out.println("===方法执行前(@)===");
    }

    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("===方法执行后(@)===");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        //执行方法 过滤 （反射）
        Signature signature = jp.getSignature();//获得签名
        System.out.println("signature:" + signature);
        Object proceed = jp.proceed();

        System.out.println("环绕后");
        System.out.println(proceed);

    }

}
