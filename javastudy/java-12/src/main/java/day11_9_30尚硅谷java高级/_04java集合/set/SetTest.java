package day11_9_30尚硅谷java高级._04java集合.set;

import day11_9_30尚硅谷java高级._04java集合.collection.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
set存储无序的，不可重复的数据
    HashSet 主要实现类 线程不安全，可存储空值
        LinkedHashSet 子类，遍历时按添加顺序来（不是有序）
    TreeSet 红黑树，存放同一个类new的数据，按对象的指定属性排序
    list有索引，有新方法，set都是继承collection的方法
 */
public class SetTest {
    //1.无序性 不等于随机性.
    //无序：添加数据按hashcode的值决定位置
    //2.不可重复性
    //保证添加元素按照equals比较不能返回true，同时必须判断hashcode
    //添加元素过程
    //不可重复的比较，不是每次添加都挨个比较，先计算哈希值，哈希值相同，（7，新元素占数组，旧元素放链表，1.8反过来），
    // equals返回true 则添加失败
    //要求：向set中添加数据，其所在类一定要重写hashcode和equals方法
    //重写的两个方法尽可能保持一致性，相等的对象必须具有相等的散列码
    @Test
    public  void test1(){
        HashSet hashSet = new HashSet();
        hashSet.add(456);
        hashSet.add(123);
        hashSet.add("aa");
        hashSet.add("bb");
        hashSet.add(new User("jerry",12));
        //
        hashSet.add(new User("jerry",12));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //在set的基础上，在添加数据时，还维护了两个变量，记录数据前后指针指向
    //频繁的遍历效率高
    @Test
    public  void test2(){
        Set hashSet = new LinkedHashSet();
        hashSet.add(456);
        hashSet.add(123);
        hashSet.add("aa");
        hashSet.add("bb");
        hashSet.add(new User("jerry",12));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
