package java8新特性.Stream.Stream中的方法;

import java8新特性.Stream.Dog;

import java.util.stream.Stream;

public class Stream08Distinct {
    public static void main(String[] args) {
        Stream.of("1", "2", "3", "3","6","6","7")
                //.map(msg ->Integer.parseInt(msg))//转换成整型
                .map(Integer::parseInt)
//                .sorted()//根据数据的自然排序顺序
                .sorted((o1, o2) -> o2-o1)//指定排序规则！！！
                .distinct()
                .forEach(System.out::println);
        System.out.println("------------");
        Stream.of(
                new Dog("旺财",1),//自定义排序需要重写hashcode和equals
                new Dog("小乖1",3),
                new Dog("小乖1",3)
        ).distinct().forEach(System.out::println);

    }
}
