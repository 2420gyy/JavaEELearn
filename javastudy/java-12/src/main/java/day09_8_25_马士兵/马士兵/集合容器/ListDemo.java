package day09_8_25_马士兵.马士兵.集合容器;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
//        输出元素的下标
        System.out.println(arrayList.indexOf(2));
//        指定位置插入元素
        arrayList.add(1,"插入元素");
//        更新指定位置元素
        arrayList.set(0,"更新元素");
//        查找指定位置的对象
        Object o = arrayList.get(1);
        System.out.println(o);
//        截取
        List list = arrayList.subList(0, 2);
        System.out.println(list);

    }
}
