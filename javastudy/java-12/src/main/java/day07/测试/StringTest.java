package day07.测试;

public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        s = "world";
        //对s赋值是改变了s所引用的对象, 而改变前后两个String对象既不是同一个对象, 内部的value值又不一样
    }
}
