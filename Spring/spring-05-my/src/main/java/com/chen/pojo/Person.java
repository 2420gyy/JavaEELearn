package com.chen.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    @Autowired//可以不写set方法了
    @Qualifier(value = "cat1")
    private Cat cat;//一下还不知道。。。。Java基础。。
    @Autowired
    //如果@Autowired自动装配环境比较复杂（有多个对象，按名字和类型都无法匹配的时候）。自动装配无法通过一个注解完成的时候
    //我们可以使用@Qualifier(value = "dog")去配合使用，指定一个唯一的id对象
    //这个环境我还模拟不出来。。。。。
    //Could not autowire. There is more than one bean of 'Cat' type.
    private Dog dog;

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }
//    //配合autowire="byName"
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
