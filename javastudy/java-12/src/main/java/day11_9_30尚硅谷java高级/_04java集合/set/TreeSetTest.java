package day11_9_30尚硅谷java高级._04java集合.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    /*
    向TreeSet中添加的对象必须是相同类的对象
    按添加顺序输出
    自定义类的排序方式： 自然排序（实现compare接口-compareTo-正数从小到大），定制排序（comparator接口）
    treeset可以按数字大小自动排序输出
    treeset特殊，定义排序规则要注意,不再是equals比较了(使用compareTo比较)()
    底层红黑树
     */
    @Test
    public void test1(){
        TreeSet treeSet = new TreeSet();
        treeSet.add(123);
        treeSet.add(2341);
        treeSet.add(1234);
        treeSet.add(4567);
        for(Object obj : treeSet){
            System.out.println(obj);
        }
    }
    @Test
    public void test2(){
        TreeSet set = new TreeSet();
        set.add(new User("tom",12));
        set.add(new User("jom",13));
        set.add(new User("mom",14));
        set.add(new User("tom",16));
        set.add(new User("pom",11));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1= (User)o1;
                    User u2= (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else {
                    throw new RuntimeException("输入数据类型不匹配");
                }
            }
        };
        TreeSet set = new TreeSet(comparator);
        //按参数标准来
        set.add(new User("tom",12));
        set.add(new User("jom",13));
        set.add(new User("mom",14));
        set.add(new User("tom",16));
        set.add(new User("pom",14));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
