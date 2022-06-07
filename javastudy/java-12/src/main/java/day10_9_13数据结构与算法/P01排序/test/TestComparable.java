package day10_9_13数据结构与算法.P01排序.test;

import day10_9_13数据结构与算法.P01排序.sort.Student;

public class TestComparable {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(18);
        student1.setName("zhangsan");
        Student student2 = new Student();
        student2.setAge(20);
        student2.setName("lisi");
        Comparable max = getMax(student1, student2);
        System.out.println(max);

    }


    public static Comparable getMax(Comparable c1,Comparable c2){
        int  res = c1.compareTo(c2);
        //res<0 c1比c2小
        //res>0 c1比c2大
        if(res>=0){
            return c1;
        }else {
            return c2;
        }
    }
}
