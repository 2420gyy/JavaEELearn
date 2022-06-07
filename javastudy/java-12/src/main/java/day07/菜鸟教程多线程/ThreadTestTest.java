package day07.菜鸟教程多线程;

class ThreadDemo1 extends Thread{
    public static int tickets = 100;

    @Override
    public void run() {
        while (true){
            sell();
        }
    }
    private static synchronized void sell(){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+"票号"+tickets);
                tickets--;
            }
    }
}


public class ThreadTestTest{
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        ThreadDemo1 threadDemo2 = new ThreadDemo1();
        threadDemo1.setName("线程01");
        threadDemo2.setName("线程02");
        threadDemo1.start();
        threadDemo2.start();

    }

}
