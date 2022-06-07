package day07.菜鸟教程多线程;

public class RunnableDemoTest implements Runnable{
    private int tickets = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "票号" + tickets);
                    tickets--;
                }
            }
        }
    }

    public static void main(String[] args) {
        RunnableDemoTest r = new RunnableDemoTest();
        new Thread(r,"线程01").start();
        new Thread(r,"线程02").start();
    }
}
