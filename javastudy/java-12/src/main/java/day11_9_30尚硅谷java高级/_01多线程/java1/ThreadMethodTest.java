package day11_9_30尚硅谷java高级._01多线程.java1;


public class ThreadMethodTest {
    //1.start()启动当前线程，调用当前线程的run()方法
    //2.run()通常需要重写，将创建的线程要执行的操作声明在此方法中
    //3.currentThread()静态方法，返回执行当前代码的线程 Thread.
    //4.getName() 获取当前线程的名字
    //5.setName() 给当前线程命名
    //6.yield() 释放cpu的执行权 Thread.
    //7.join() 抢占线程，直到执行完,另一个线程变成阻塞状态
    //8.stop() 强制结束当前线程
    //9.sleep(long millis)  让当前线程”睡眠“指定毫秒，此时间内是阻塞状态 Thread.
    //10.isAlive()
    //ctrl+o
    //线程的优先级
    //public static final int MIN_PRIORITY = 1;
    //public static final int NORM_PRIORITY = 5;
    //public static final int MAX_PRIORITY = 10;
    //获取和设置优先级 大概率优先执行
    //getPriority()
    //setPriority()
    public static void main(String[] args) {
       ThreadFor threadFor = new ThreadFor("Thread:1");
//       threadFor.setName("线程一");
        //设置分线程的优先级
       threadFor.setPriority(Thread.MAX_PRIORITY);
       threadFor.start();

       //给主线程命名
       Thread.currentThread().setName("主线程");
       Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+"==="+i+"优先级"+Thread.currentThread().getPriority());
            }
//            if(i == 21){
//                try {
//                    threadFor.join(); //在主线程等于21时，threadFor抢占线程，直到执行完
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(threadFor.isAlive());
    }
    static class ThreadFor extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if(i%2==0){
//                    try {
//                        //继承时，子类抛出的异常范围不能比父类的大
//                        //继承于Thread 又被static修饰，可以直接写
//                        sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(getName()+"==="+i+"优先级"+getPriority());//省略this

                }
                if(i%20==0) {
//                    this.yield();
                }

            }
        }
        //通过构造器给线程命名
        public ThreadFor(String name) {
            super(name);
        }
    }
}
