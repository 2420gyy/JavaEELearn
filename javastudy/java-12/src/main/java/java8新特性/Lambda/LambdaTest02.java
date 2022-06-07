package java8新特性.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<Person> list =  new ArrayList<>();
        list.add(new Person("a",33,12));
        list.add(new Person("b",34,14));
        list.add(new Person("c",35,15));
        list.add(new Person("d",32,23));

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        list.forEach(System.out::println);
        System.out.println("-----------------------");
        // Collections.sort(list,(Person o1,Person o2) -> {
        //     return o1.getAge() - o2.getAge();
        // });
        Collections.sort(list, Comparator.comparingInt(Person::getAge));
        list.forEach(System.out::println);
    }

}
