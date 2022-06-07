package day11_9_30尚硅谷java高级._01多线程.java1;

//多线程的创建
//一创建一个继承Thread类的子类
//二重写Thread类的run()
//三创建Thread类的子类对象
//四通过此子类对象调用start()方法 : 启动当前线程 ，调用当前线程的run
 class MyThread extends Thread{
        //重写方法 新建线程
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if(i%2==0){
                    //当前线程默认名: Thread-0
                    System.out.println(Thread.currentThread().getName()+" === "+i);
                }
            }
        }
    }
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        //直接调用run方法就不是新建线程了
        t1.start();

        //再次启动一个线程，不能t1.start();
        // if (threadStatus != 0)
        //    throw new IllegalThreadStateException();

        new MyThread().start();

        //个线程同时进行
        System.out.println("当前线程的名字:"+Thread.currentThread().getName());
    }


}
