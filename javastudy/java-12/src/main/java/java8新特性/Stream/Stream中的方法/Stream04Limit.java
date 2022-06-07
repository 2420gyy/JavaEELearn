package java8新特性.Stream.Stream中的方法;

import java.util.stream.Stream;

public class Stream04Limit {
    public static void main(String[] args) {
        Stream<String> a1 = Stream.of("a1", "a2", "a3", "a4");
        a1.limit(3).forEach(System.out::println);
    }
}
