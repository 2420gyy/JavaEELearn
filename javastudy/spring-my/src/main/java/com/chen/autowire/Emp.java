package com.chen.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Emp {
    @Value("部门名字")//注入普通类型属性
    private String name;

    @Qualifier(value = "dept")//根据属性名称进行注入，一个接口多个实现类，找哪个不知道。懂？
    private Dept dept;

//@autowire通过byType实现，而且必须要求这个对象存在
//@resource默认通过byName实现，如果找不到，通过byType实现 java包中的
    @Autowired
    private Dept2 dept2;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                ", dept2=" + dept2 +
                '}';
    }

    public void test(){
        System.out.println(dept);
        System.out.println(dept2);
    }

}
