package com.chen.aop;

import com.chen.springtest.pojo.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao =(UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int res = dao.add(1, 2);
        System.out.println("res是"+res);
        //Exception in thread "main" java.lang.NullPointerException
        //	at com.sun.proxy.$Proxy0.add(Unknown Source)
        //	at com.chen.aop.JDKProxy.main(JDKProxy.java:16)
    }
}
//创建代理对象的代码
class UserDaoProxy implements InvocationHandler {

    //先执行代理对象的方法，传过来
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法执行之前.."+method.getName()+"传递的参数.."+args.toString());

        //被增强的方法
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法执行之后.."+res);
        return null;
    }
}
