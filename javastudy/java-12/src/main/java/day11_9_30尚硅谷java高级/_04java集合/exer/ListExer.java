package day11_9_30尚硅谷java高级._04java集合.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListExer {
    @Test
    public void testListRemove(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        updateList(arrayList);
        System.out.println(arrayList);
    }
    private static void updateList(List list){
//        list.remove(2); //idnex
        list.remove(new Integer(2));
    }

//    去除list中的重复数据，要求尽量简单
    @Test
    public void test2(){
        List arrayList = new ArrayList();
        arrayList.add(3);
//        把数据加入到set中，这里数字最好用包装类型，并且包装类重写了equals方法
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(2);
        List list = duplicateList(arrayList);
        for(Object obj:list){
            System.out.println(obj);
        }

    }
    static List duplicateList(List list){
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
//        return (List)hashSet;
        return new ArrayList(hashSet);//!!!!!!!!!
    }
}
