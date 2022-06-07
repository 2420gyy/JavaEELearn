package java8新特性.Stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.stream();
        Set<String> set = new HashSet<>();
        set.stream();
        Vector vector = new Vector();
        vector.stream();

        Map<String,Object> map = new HashMap<>();
        map.put("1",new String[] {"aa","bb"});
        map.put("2",new Integer[] {1,2,3,4});
        map.put("3",new Integer[] {1,2,3,4,5});
        Stream<String> stream = map.keySet().stream();//key
        stream.forEach(System.out::println);
        Stream<Object> stream1 = map.values().stream();//value
        stream1.forEach(System.out::println);//????????
        Stream<Map.Entry<String, Object>> stream2 = map.entrySet().stream();//entry
        stream2.forEach(System.out::println);

        //好好看看
        Dog dog = new Dog();
        Map<String, List<Dog>> map11 = new HashMap<>();
        List<Dog> listDog = new ArrayList<>();
        for (Map.Entry<String, List<Dog>> entry11 : map11.entrySet()){
            // 。。。
            listDog.addAll(entry11.getValue());
        }
        System.out.println("----------------------------------------");
        // 创建一个HashMap
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // 访问 HashMap 中的每一个映射项
        System.out.print("Entries: ");

        // entrySet()返回了 HashMap 中所有映射项的一个 set 集合视图
        // for-each loop 在该视图中访问了每一映射项
        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }


    }
}
