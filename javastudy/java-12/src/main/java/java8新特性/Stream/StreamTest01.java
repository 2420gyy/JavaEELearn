package java8新特性.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三","成龙","周星驰","张三丰");
        List<String> list1 = new ArrayList<>();
        //1.获取所有姓张的
        for (String s : list) {
            if(s.startsWith("张")){
                list1.add(s);
            }
        }
        //2.获取名字长度为3的用户
        List<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.length() == 3){
                list2.add(s);
            }
        }
        //3.输出所有的用户信息
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
