package day11_9_30尚硅谷java高级._01多线程.java2;

//
public class BankTest {

}
class Bank{
    private Bank(){}
    private static Bank instance = null;

    private static synchronized Bank getInstance(){
        //方式一，效率差（第一个进去后没了，但是后面的线程还在排队）
//        synchronized (Bank.class){
//            if(instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二 效率更高
        if(instance == null){
            synchronized (Bank.class){
                if(instance == null){
                    //线程安全问题，在这个地方阻塞使得多个线程走到这里
                    instance = new Bank();
                }
            }
        }
        return instance;

    }
}