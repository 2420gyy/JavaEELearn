package day11_9_30尚硅谷java高级._04java集合.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

    //提供一种方法访问一个容器对象中各个元素而又补需暴露该对象的内部细节
    @Test
    public void test1(){
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add("345");
        c1.add(new Person("tom",12));
        c1.add(false);
        Iterator iterator = c1.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());

        while (iterator.hasNext()){
            //next 指针下移，将下移以后集合位置上的元素返回（指针最开始指向空）
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add("345");
        c1.add(new Person("tom",12));
        c1.add(false);
        Iterator iterator = c1.iterator();
        //每次调用iterator()都会得到一个全新的迭代器对象
        //iterator 用来遍历colleation,（没有map）
        //remove() 删除指针所在位置，必须要有指针，还只能有一个
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if("345".equals(obj)){
                iterator.remove();
            }
        }
        //这里指针已经到末尾了，必须重新生成iterator!!!
        Iterator iterator1 = c1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
