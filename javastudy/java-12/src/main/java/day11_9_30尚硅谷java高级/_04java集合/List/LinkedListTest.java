package day11_9_30尚硅谷java高级._04java集合.List;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void test1(){
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");

        sites.addFirst("first");
        sites.addLast("end");
        System.out.println(sites);
        sites.removeFirst();
        sites.remove(0);
        System.out.println(sites);
    }
}
