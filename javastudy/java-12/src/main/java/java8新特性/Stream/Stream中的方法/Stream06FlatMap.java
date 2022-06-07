package java8新特性.Stream.Stream中的方法;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author chenchen
 * @date 2021-11-08 16:09
 */
public class Stream06FlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1", "5", "2", "10", "3");
        List<String> list2 = Arrays.asList("2", "0");
        List<String> list3 = Arrays.asList("7", "9");
        List<String> list4 = Arrays.asList("12");
        Stream<List<String>> listStream = Stream.of(list1, list2, list3, list4);
        listStream.flatMap(list-> list.stream()).forEach(System.out::println);

        System.out.println("================================================");
        Stream.of(list1,list2,list3,list4).flatMap(list->{
            return  list.stream();
        }).forEach(System.out::println);



    }
}
