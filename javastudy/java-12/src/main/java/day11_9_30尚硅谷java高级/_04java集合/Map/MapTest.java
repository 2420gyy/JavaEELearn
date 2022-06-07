package day11_9_30尚硅谷java高级._04java集合.Map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/*
Map：双列数据，存储key-value
    HashMap：线程不安全，效率高，存储null，
        LinkedHashMap:有序的（多了一对指针） 频繁的遍历操作，效率高，
    TreeMap:有序的（按key排序），底层是红黑树
    Hashtable:古老实现类，线程安全，不能存储null
        Properties: 处理配置文件，key-value都是string类型

    HashMap: 数组+链表
             数组+链表+红黑树
面试题：
1.HashMap的底层原理
2.HashMap与Hashtable的异同？ 线程不安全，效率高，存储null / 古老实现类，线程安全，不能存储null
3.currentHashMap 与 Hashtable 的异同？ 分段锁

Map理解：
    map中的值是无序的，不可重复的，使用set存储key -> key所在的类（自定义类）要重写equals和hashCode（hashmao）
    value无序的，可重复，使用Collection存储所有的value ->values所在的类要重写equals（）
    一个键值对构成了一个Entry对象
    map中的entry：无序的，不可重复的，使用set存储

 */
public class MapTest {
    @Test
    public void test1(){
        HashMap map = new HashMap();
        map.put(null,null);
        System.out.println(map);
        Hashtable hashtable = new Hashtable();
        hashtable.put(1,123);
        System.out.println(hashtable);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1,"aa");
        linkedHashMap.put(3,"cc");
        linkedHashMap.put(2,"bb");
        System.out.println(linkedHashMap);

        HashMap map1 = new HashMap();
        map1.put(1,"key不可以重复");
        map1.put(2,"value可以重复");
        map1.put(3,2);
        System.out.println(map1);
    }
    @Test
    public void test2(){
        HashMap map = new HashMap();
        map.put(1,"aa");
        map.put(3,"cc");
        map.put(2,"bb");
        System.out.println(map);

    }
}
