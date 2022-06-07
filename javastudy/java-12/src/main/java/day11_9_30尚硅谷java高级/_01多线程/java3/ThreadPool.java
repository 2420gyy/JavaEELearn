package day11_9_30尚硅谷java高级._01多线程.java3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//创建线程的方式，线程池
//

class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"："+i);
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        //ExecutorService是一个接口 Executors实现了接口
        //方法的返回值是ExecutorService或其子类对象，又因为他是接口，所以返回的只会是实现类对象
        //把实现类对象赋值给接口的声明就是多态了？？？
        //1.提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //向下转型，强转
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) executorService;
        //设置线程池的属性
        service1.setCorePoolSize(15);

        //提供参数-要做什么
        executorService.execute(new NumberThread());//适合使用于Runnable
//      executorService.submit(callable);//适合使用于Callable
        executorService.shutdown();
    }
}
