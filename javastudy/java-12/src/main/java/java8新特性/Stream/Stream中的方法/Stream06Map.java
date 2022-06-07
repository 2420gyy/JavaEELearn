package java8新特性.Stream.Stream中的方法;

import java8新特性.Stream.Dog;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream06Map {
    public static void main(String[] args) {
        //流中的数据映射到另一个流中
        Stream.of("1", "3", "2", "0","5","6","4")
                //.map(msg ->Integer.parseInt(msg))//转换成整型
                .map(Integer::parseInt)
                .forEach(System.out::println);
        System.out.println("----------------------");
        //对象的转换
        A a1 = new A();
        A a2 = new A();
        a2.setId(2L);
        a2.setName("李四");
        a1.setId(1L);
        a1.setName("张三");
        List<A> aList = new ArrayList<>();
        aList.add(a1);//!!!!!!
        aList.add(a2);//!!!!!!
        List<Object> collect = aList.stream().map(a -> {
            B b = new B();
            b.setId(a.getId());
            b.setName(a.getName());
            return b;
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("----------------------");
        //将集合根据name字段转换成map(分组)
        Map<String, A> collect1 = aList.stream()
                .collect(Collectors.toMap(A::getName, e -> e, (k1, k2) -> k1));
        System.out.println(collect1);
        System.out.println("----------------------");
        //拆箱 -flatMap 将List<List<A>>中双层list转换成单层
        List<List<A>> alist2 = new ArrayList<>();
        List<A> collect2 = alist2.stream().flatMap(Collection::stream).collect(Collectors.toList());


    }




    @Data
    static
    class A{
        private Long id;
        private String name;
        private int age;
    }
    @Data
    static
    class B{
        private Long id;
        private String name;
        private int age;
    }

}
