package day07.测试;


import java.util.ArrayList;




public class ArrayListThreadTest {

    private static ArrayList<String> sites = new ArrayList<String>();

    static class Ts implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                //存储时格式为：线程名称+第几次存储（方便打印输出时比较）
                sites.add(Thread.currentThread().getName()+"   "+i);
            }
        }
    }

    public static void main(String[] args) {

        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");

        new Thread(new Ts(),"test1").start();
        new Thread(new Ts(),"test2").start();


        //给主线程进行休眠操作，目的时为了让test1,tes2线程执行完成
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打印输出两条线程存储在ArrayList中的数据
        for (int i = 0; i <ArrayListThreadTest.sites.size() ; i++) {
            System.out.println(ArrayListThreadTest.sites.get(i));
        }

    }

}
