package day11_9_30尚硅谷java高级._01多线程.java1;

/*
创建多线程的方式二，实现Runnable接口
1.创建一个实现了Runnable接口的类
2.实现类去实现Runnable接口中的抽象方法 run()
3.创建实现类的对象
4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
5.通过Thread类的对象调用start()
 */
public class ThreadTest2 {

    public static void main(String[] args) {
        MThread mThread = new MThread();

        Thread thread = new Thread(mThread); //多态?busb
        Thread thread1 = new Thread(mThread);
        thread.setName("线程一");
        thread1.setName("线程二");
//      重新命名的作用
        thread.start();
        //if (target != null) {
        //         target.run();//target == mThread
        //        }
        thread1.start();
        //调的不是同一个run方法


    }
    static class MThread implements Runnable{
        private int a=100;
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+"=="+i+"==a的值为:"+a);
                    a--;
                }
            }
        }
    }
}
