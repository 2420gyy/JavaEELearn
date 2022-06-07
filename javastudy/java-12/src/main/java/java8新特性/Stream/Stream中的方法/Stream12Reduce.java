package java8新特性.Stream.Stream中的方法;

import java8新特性.Stream.Dog;

import java.util.Objects;
import java.util.stream.Stream;

public class Stream12Reduce {
    public static void main(String[] args) {
        Dog dog = new Dog("小明1",32);
        if(Objects.requireNonNull(dog.getName(),"错误")=="小明"){
            System.out.println("ssss");
        }else System.out.println(" ");
    }
}
