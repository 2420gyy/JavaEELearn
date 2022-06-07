package java8新特性.Stream.Stream中的方法;

import java.util.stream.Stream;

public class Stream02Count {
    public static void main(String[] args) {
        Stream<String> a1 = Stream.of("a1", "a2", "a3", "a4");
        long count = a1.count();
        System.out.println(count);
    }
}
