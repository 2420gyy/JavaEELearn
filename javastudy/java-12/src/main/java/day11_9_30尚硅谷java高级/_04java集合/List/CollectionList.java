package day11_9_30尚硅谷java高级._04java集合.List;

import day11_9_30尚硅谷java高级._04java集合.collection.Person;
import org.junit.Test;

import java.util.*;

/*
ArrayList,LinkedList,Vector 三者的异同
相同：都实现了List接口，存储数据特点相同，有序，可重复的数据
不同：ArrayList ； 主要实现类，线程不安全，效率高，底层使用Object[]存储，查找效率高
    jkd1.7 创建长度为10的数组，扩容1.5倍，开发时建议使用带参构造器
    jdk1.8 底层Object[] elementData初始化为{}，在第一次add时才创建长度为10的数组，懒汉式

    LinkedList ：底层使用的双向链表，扩容2倍，对于频繁的插入，删除，效率高
        内部声明了Node类型的first和last属性，
    Vector ：古老实现类，线程安全，效率低，底层使用Object[]存储

    P529
 */
//List除了从Collection集合继承方法外，还添加了一些根据索引来操作集合元素的方法
//toArray()	将 arraylist 转换为数组
//toString()	将 arraylist 转换为字符串
//常用方法
// 增 add(Object obj)
// 删 remove(int index)/(Object obj)
// 改 set(int index)
// 查 get(int index)
// 插入 add(int index,Object ele)
//长度 size()
//遍历 迭代器/增强for循环/普通循环
public class CollectionList {
    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(234);
        arrayList.add("aa");
        arrayList.add(123);
        arrayList.add(new Person("tom",12));

        System.out.println(arrayList);

        arrayList.add(1,"按索引插入");
        System.out.println(arrayList);

        List list = Arrays.asList(1, 2, 3);
        arrayList.addAll(list);//1, 2, 3,
        arrayList.add(list);//把list看成一个整体  [1, 2, 3]
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));

        System.out.println("123首次出现位置，-1为没有="+arrayList.indexOf(123));
        System.out.println("123最后出现位置="+arrayList.lastIndexOf(123));

        //返回删除索引处的元素
        System.out.println("删除索引为0位置的元素"+arrayList.remove(0));
        arrayList.set(1,"重新设置值");
        System.out.println(arrayList);
        //subList() 返回左闭右开的子集合
        System.out.println(arrayList.subList(0,2));


    }

    @Test
    public void test2(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(234);
        arrayList.add("aa");
        arrayList.add(123);
        arrayList.add(new Person("tom",12));

//        Collections.sort(arrayList);
//        System.out.println(arrayList);
        //迭代器！！！Collection接口呀！！！
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-=====-");
        for(Object obj : arrayList){
            System.out.println(obj);
        }
        System.out.println("-=====-");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

}
