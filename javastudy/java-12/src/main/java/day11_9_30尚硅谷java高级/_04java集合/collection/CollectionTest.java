package day11_9_30尚硅谷java高级._04java集合.collection;

import org.junit.Test;

import java.util.*;

//注意，重写equals的问题（比较集合中对象时不重写比较的就是地址了）
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
//        ArrayList coll = new ArrayList();
//        LinkedList coll = new LinkedList();
//        coll.indexOf(1);
//        coll.getFirst();

        //add()
        coll.add("aa");
        coll.add("12");
        coll.add(123);//自动装箱
        coll.add(new Date());

        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add(234);
        coll.addAll(coll1);

        System.out.println(coll);

        //将集合清空，集合还在
        coll.clear();
        //判断集合是否为空
        System.out.println(coll.isEmpty());

    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("jerry",20));

        //contains(obj) 判断集合是否包含obj
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        //调用equals 没有重写，调用object的equals ，即==
        //
        System.out.println(coll.contains(new Person("jerry",20))); //重写后就是true

        //2.coll.containsAll(coll1) 判断coll1中的元素是否都在当前集合中
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }

    @Test
    public void test3(){
        //remove(Object obj) 从当前集合中删除元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        System.out.println(coll);
        //会调用equals方法 Integer重写过了 比较内容，没有重写则等价于==，比较地址
        boolean remove = coll.remove(123);//没有返回false
        System.out.println(remove);
        //removeAll(Collection coll1) //从当前集合中，移除coll1中的所有元素 移除共有的
        Collection coll1 = Arrays.asList(123,1234);
        coll.removeAll(coll1);
        System.out.println(coll);

        //ratainAll(Collection coll) 获取交集，
        //equals(Object obj)
        Collection c2 = new ArrayList();//这个是有序的，
        c2.add(123);
        c2.add(1234);
        Collection c3 = new ArrayList();
        c3.add(123);
        c3.add(1234);
        System.out.println(c3.equals(c2));

    }

    @Test
    public void test4(){
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(234);
        c1.add("345");
        System.out.println(c1.hashCode());//通过元素确定存储位置

        //集合转为数组
        Object[] objects = c1.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
        //数组转集合
        List<String> strings = Arrays.asList(new String[]{"aa", "bb", "cc"});
        System.out.println(strings);//[aa, bb, cc]

        //注意！！！
        List<int[]> ints = Arrays.asList(new int[]{1, 2, 3});
        System.out.println(ints);//[[I@a74868d]

        List integers = Arrays.asList(123, 456);
        System.out.println(integers);//[123, 456]

        List ints1  = Arrays.asList(new Integer[]{1, 2, 3});
        System.out.println(ints1);//[1, 2, 3]

        //iterator() 返回Iterator接口的实例，用于遍历集合元素
    }
}
