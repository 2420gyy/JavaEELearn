package day11_9_30尚硅谷java高级._01多线程.java2;

//解决线程安全问题的方式三:locak锁---jdk5.0新增
//1.面试题 synchronized与lock的区别
//都可以解决线程安全问题
//不同：
import java.util.concurrent.locks.ReentrantLock;

//当用继承的方式时，run方法要加static！！！
class Window implements Runnable{

    private int ticket = 100;

    //实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public  void run() {
        while (true){
            try{
                //2.调用锁定的方法lock
                lock.lock();
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                //3.调用解锁的方法
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();

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
}
