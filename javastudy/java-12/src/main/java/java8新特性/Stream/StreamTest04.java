package java8新特性.Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {

        Stream<String> a1 = Stream.of("a1", "a2", "a3", "a4");
        String[] arr1 = {"aa","bb","cc"};
        Stream<String> arr11 = Stream.of(arr1);
        Integer[] arr2 = {1,2,3,4};
        Stream<Integer> arr21 = Stream.of(arr2);

        arr21.forEach(System.out::println);
        //注意：基本数据类型的数组是不行的
        int[] arr3 = {1,2,3,4};
        Stream.of(arr3).forEach(System.out::println);//[I@3796751b


    }
}
