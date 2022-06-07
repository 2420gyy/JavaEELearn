package day07.菜鸟教程多线程;

import java.util.HashMap;



//增put 删remove 改查get
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(2,"b");
        hashMap.put(3,"c");
        hashMap.put(4,"d");
//        System.out.println(hashMap);
//        System.out.println(hashMap.get(2));//b
//        System.out.println(hashMap.remove(1));//a
//        System.out.println(hashMap.remove(3,"c"));//true

        hashMap.putIfAbsent(5,"e");
        hashMap.putIfAbsent(1,"e");//如果 hashMap 中不存在指定的键，则将指定的键/值对插入到 hashMap 中。
        hashMap.replace(1,"替换");
        System.out.println("entrySet"+hashMap.entrySet());//返回 hashMap 中所有映射项的集合集合视图。
        System.out.println("keySet"+hashMap.keySet());//返回 hashMap 中所有 key 组成的集合视图。
        System.out.println("values"+hashMap.values());//返回 hashMap 中存在的所有 value 值。

        System.out.println(hashMap);
    }
}
