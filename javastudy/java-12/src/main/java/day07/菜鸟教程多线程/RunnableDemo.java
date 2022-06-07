package day07.菜鸟教程多线程;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"=:="+i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        new Thread(r,"线程01").start();
        new Thread(r,"线程02").start();
    }
}
