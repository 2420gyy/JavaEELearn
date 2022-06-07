package day11_9_30尚硅谷java高级._04java集合.Map;

import org.junit.Test;

import java.util.*;

public class MapMethodTest {

    @Test
    public void test1(){

        HashMap map = new HashMap();
        map.put(1,"a");
        map.put(2,"a");
        map.put(3,"a");
        //修改
        map.put(1,"4");
        System.out.println(map);
        HashMap map1 = new HashMap();
        map1.put("cc","cc");
        map1.put("dd","dd");
        map.putAll(map1);
        System.out.println(map);
        //remove(Object key)移除
        //clear() 清空数据
        //get(Object key)
        //containsKey()
        //containsValues()
        //size()
        //isEmpty() 判断map是否为空
        //equals
        System.out.println(map.equals(map1));

    }
    @Test
    public void test2(){
        HashMap map1 = new HashMap();
        map1.put(1,"a");
        map1.put(2,"b");
        HashMap map2 = new HashMap();
        map2.put(2,"b");
        map2.put(1,"a");
        System.out.println(map1.equals(map2));//false
    }
    @Test
    public void test3(){
        //元视图的操作
        HashMap map1 = new HashMap();
        map1.put(1,"a");
        map1.put(2,"b");
        map1.put(3,"c");
        //遍历key
        Set set = map1.keySet();
        for (Object obj : set){
            System.out.println(obj);
        }
        //遍历value
        Collection values = map1.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set set1 = map1.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object obj = iterator1.next();
            Map.Entry me = (Map.Entry) obj;
            System.out.println(me.getKey()+"----"+me.getValue());
        }
        Set set2 = map1.keySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map1.get(key);
            System.out.println(key+"==="+value);
        }

    }
}
