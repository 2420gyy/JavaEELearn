package java8新特性.Stream.Stream中的方法;

import java.util.stream.Stream;

public class Stream07Sorted {
    public static void main(String[] args) {
        Stream.of("1", "2", "3", "4","5","6","7")
                //.map(msg ->Integer.parseInt(msg))//转换成整型
                .map(Integer::parseInt)
//                .sorted()//根据数据的自然排序顺序
                .sorted((o1, o2) -> o2-o1)//指定排序规则！！！
                .forEach(System.out::println);

    }
}
