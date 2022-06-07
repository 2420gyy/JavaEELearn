package day09_8_25_马士兵.马士兵.集合容器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversal {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add("1");
        arr.add("2");
        arr.add("3");
        for (int i = 0; i < arr.size(); i++) {
            String str = (String)arr.get(i);
            System.out.println(str);
        }


        Iterator iterator = arr.iterator();
        boolean b = iterator.hasNext();
        //获取next元素的内容
        System.out.println(iterator.next());

        //如何遍历集合
        while(iterator.hasNext()){
            System.out.println((String)iterator.next());
        }

//        遍历的过程无法删除，使用ListIterator
        ListIterator listIterator = arr.listIterator();
        while(listIterator.hasNext()){
            String str2 = (String)listIterator.next();
            if(str2.equals("1")){
                listIterator.remove();
                continue;
            }
            System.out.println(str2);
        }

    }
}
