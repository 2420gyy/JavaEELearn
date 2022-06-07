package com.kuang.demo04;

import com.kuang.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//使用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类 --- 代码是死的，只要改rent ，具体方法在jdk1.8的说明文档里
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        //这里有好几个参数，不好理解，第一个是getClassLoader ？？？
        //第二个，被代理的接口
        // 最后的this是invocationHandler ，因为这里实现了他，所有就是当前类
    }


    @Override
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理本质，使用反射机制实现
        Object result = method.invoke(target, args);
        log(method.getName());
        return result;
    }

    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
