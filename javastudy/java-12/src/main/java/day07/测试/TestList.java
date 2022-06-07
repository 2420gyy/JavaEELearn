package day07.测试;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zjj
 * @create 2020-05-11-16:17
 */
public class TestList implements Runnable {
    //这里使用的List接口的ArrayList实现类
    public static final List list = new ArrayList();//两次测试只有这里不同，其他地方完全相同！
    //并发执行的代码
    @Override
    public void run() {
        //对每个线程的集合进行10次数据存储
        for (int i = 0; i < 10; i++) {
            //存储时格式为：线程名称+第几次存储（方便打印输出时比较）
            list.add(Thread.currentThread().getName()+"   "+i);
        }
    }

    public static void main(String[] args) {
        //声明并执行两个线程
        TestList test1 = new TestList();
        TestList test2 = new TestList();
        new Thread(test1,"test1").start();
        new Thread(test2,"test2").start();
        //给主线程进行休眠操作，目的时为了让test1,tes2线程执行完成
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印输出两条线程存储在ArrayList中的数据
        for (int i = 0; i < TestList.list.size(); i++) {
            System.out.println(TestList.list.get(i));
        }
    }
}

