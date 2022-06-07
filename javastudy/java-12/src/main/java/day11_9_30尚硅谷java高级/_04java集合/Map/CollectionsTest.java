package day11_9_30尚硅谷java高级._04java集合.Map;

import day07.测试.A;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    /*
    操作collection和map的工具类
    面试题：collection和collections的区别
    一个接口，一个工具类
     */
    @Test
    public void test(){
//        Collections.sort();
        List list = new ArrayList();
        list.add(123);
        list.add(13);
        list.add(23);
        list.add(-1);
//        ArrayList dest = new ArrayList(4);
//        Collections.copy(dest,list);
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());//4
        System.out.println(dest);//[null, null, null, null]
        Collections.copy(dest,list);
        System.out.println(dest);
    }
}
