package day11_9_30尚硅谷java高级._01多线程.java2;

public class WindowTest4 {
    //创建三个窗口买票，共100张
    //存在线程安全问题
    //this指代唯一可以用，可以用当前类来作为同步监视器，同步监视器: 俗称锁，任何一个类的对象，都可以充当锁;
    //使用同步方法解决线程安全问题
    public static void main(String[] args) {

        window w1 = new window();
        window w2 = new window();
        window w3 = new window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
    static class window extends Thread{

        //加static 每个对象共享同一个静态变量
        private static int ticket =100;
        @Override
        public void run() {
            while(true) {
                    show();
                }
        }
        private static synchronized void show(){
            //静态方法只能调用静态的
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                ticket--;
            }
        }
    }
}
