package day11_9_30尚硅谷java高级._04java集合.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class ForEachTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("aa");
        coll.add("12");
        coll.add(123);//自动装箱
        coll.add(new Date());
        //   集合中元素类型 变量 : 集合对象
        for (Object obj : coll){
            System.out.println(obj);
            //内部仍然调用迭代器
        }
    }
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4};
        for (int i : arr) {
            System.out.println(i);
        }
    }
    @Test
    public void test3(){
        String[] str = new String[]{"aa","bb","cc"};
        //普通for循环
        for (int i = 0; i < str.length; i++) {
            str[i] = "gg";
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        String[] str1 = new String[]{"aa","bb","cc"};
        //增强for循环
        for(String s : str1){
            s = "gg";
            //s是局部的，取出的元素赋值，不改变原有数组的
        }
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
