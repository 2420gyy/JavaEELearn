package day11_9_30尚硅谷java高级._01多线程.java3;

//线程的通信
//两个线程交替打印1-100
class Number implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while(true){
            //a+s+z
            synchronized (this) {
                //注意：同步监视器必须一致
                //第一次进来没有意义，第二次线程二进来，唤醒线程一，此时线程二拿着同步监视器（锁）
                //一旦wait，当前线程就进入阻塞状态，并自动释放锁
                //sleep，睡着了，锁还在，不释放
                this.notify();

                if(number <= 100){
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        //使得调用如下方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }
}
