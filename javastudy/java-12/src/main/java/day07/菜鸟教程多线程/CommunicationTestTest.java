package day07.菜鸟教程多线程;


//两个线程交替打印1~100
public class CommunicationTestTest implements Runnable{

    private int number = 1;
    @Override
    public synchronized void run() {

        while(true){

            this.notify();

            if(number<=100){
                System.out.println(Thread.currentThread().getName()+"="+number);
                number++;
            }else break;//不加线程就。。。

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CommunicationTestTest c = new CommunicationTestTest();
        new Thread(c,"线程01").start();
        new Thread(c,"线程02").start();

    }


}
