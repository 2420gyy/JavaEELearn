package day09_8_25_马士兵.马士兵.集合容器;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建一个集合
        Collection arrayList = new ArrayList();
        arrayList.add("123");
        arrayList.add(1);
        arrayList.remove(1);
        System.out.println(arrayList.size());
        //判断是否包含对象
        boolean isContains = arrayList.contains("123");
        System.out.println(isContains);

    }

}
