package java8新特性.Stream;

import java.util.stream.Stream;

public class StreamTest05 {
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
