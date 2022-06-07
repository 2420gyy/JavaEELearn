package day11_9_30尚硅谷java高级._04java集合.exer;

import org.junit.Test;

import java.util.HashSet;

public class SetTest {
    @Test
    public void test01(){
        HashSet hashSet = new HashSet();
        Person p1 = new Person(1001, "aa");
        Person p2 = new Person(1002, "bb");

        hashSet.add(p1);
        hashSet.add(p2);
        p1.setName("cc");//
        hashSet.remove(p1);//删除时要计算哈希值，而此时p1还是aa与1001计算的哈希值，再次计算1001和cc的哈希值不能删除p1
        System.out.println(hashSet);
        hashSet.add(new Person(1001,"cc"));//三个对象，这里是空的！！！，原本的cc占着aa的位置
        System.out.println(hashSet);
        hashSet.add(new Person(1001,"aa"));//哈希值相同，但是equals不同了
        System.out.println(hashSet);

    }
}
