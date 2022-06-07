package day11_9_30尚硅谷java高级._01多线程.java1;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        new Thread(a).start();
        System.out.println(Thread.currentThread().getName());
    }
    static class A implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"===="+i);
            }
        }
    }
}
