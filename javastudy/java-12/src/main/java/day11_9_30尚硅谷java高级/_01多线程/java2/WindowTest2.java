package day11_9_30尚硅谷java高级._01多线程.java2;

public class WindowTest2 {
    //创建三个窗口买票，共100张
    //存在线程安全问题
    //当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
    //如何解决，当一个线程a在操作ticket时，其他线程不能参与进来，直到a操作完成，即使a阻塞了，也不能改变
    //通过同步机制，
    //一：同步代码块
    //synchronized(同步监视器){
    // 需要被同步的代码：说明，操作共享数据的代码，即。。。;共享数据 多个线程共同操作的变量
    //同步监视器: 俗称锁，任何一个类的对象，都可以充当锁;
    //                 要求: 多个线程必须要共用同一把锁
        // 可以考虑用this代替同步监视器
    // }
    //二：同步方法
    //如果操作共享数据的代码都写在一个方法中，

    //同步的方式，解决了线程安全的问题---好处
    //操作同步代码时，只能有一个线程参与，其他线程等待，相当于是一个单线程方式，效率低---局限性
    public static void main(String[] args) {

        window w = new window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
    static class window implements Runnable{

        //加static 每个对象共享同一个静态变量
        //new了一回，所以不用加static
        private int ticket =100;
        Object obj = new Object();
        @Override
        public void run() {
            while(true){
                //保证唯一的对象w，this
                synchronized (this){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+": 卖票，票号为："+ticket);
                    ticket--;
                }else {
                    break;
                }
                }
            }
        }
    }
}
