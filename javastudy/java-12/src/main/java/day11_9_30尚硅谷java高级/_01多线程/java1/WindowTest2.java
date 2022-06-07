package day11_9_30尚硅谷java高级._01多线程.java1;

public class WindowTest2 {
    //创建三个窗口买票，共100张
    //存在线程安全问题
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

        @Override
        public void run() {
            while(true){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+": 卖票，票号为："+ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
