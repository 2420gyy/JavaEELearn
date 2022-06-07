package day11_9_30尚硅谷java高级._04java集合.exer;

import org.junit.Test;

import java.util.TreeSet;

public class EmployeeTest {
    //使用自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("tom", 33, new MyDate(1984, 1, 2));
        Employee e2 = new Employee("jerry", 34, new MyDate(1985, 4, 4));
        Employee e3 = new Employee("tim", 31, new MyDate(1987, 6, 5));
        Employee e4 = new Employee("jone", 37, new MyDate(1981, 2, 3));
        Employee e5 = new Employee("lili", 43, new MyDate(1997, 6, 6));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

    }
    //使用自然排序
    @Test
    public void test2(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("tom", 33, new MyDate(1984, 1, 2));
        Employee e2 = new Employee("jerry", 34, new MyDate(1985, 4, 4));
        Employee e3 = new Employee("tim", 31, new MyDate(1987, 6, 5));
        Employee e4 = new Employee("jone", 37, new MyDate(1981, 2, 3));
        Employee e5 = new Employee("lili", 43, new MyDate(1997, 6, 6));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
    }
}
