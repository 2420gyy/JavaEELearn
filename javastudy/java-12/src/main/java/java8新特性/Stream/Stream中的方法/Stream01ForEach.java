package java8新特性.Stream.Stream中的方法;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream01ForEach {
    public static void main(String[] args) {
        /**
         * 注意下面的输出！！！思想
         */
        Stream<String> a1 = Stream.of("a1", "a2", "a3", "a4");
        a1.filter(s -> {
            System.out.println("--------");
            return s.contains("a");}).forEach(System.out::println);
        System.out.println("---------------------------");
    }
}
