package day11_9_30尚硅谷java高级._01多线程.exer;

//银行有一个账户，
//有两个储户分别向同一个账户存3000元，每次存100，存3次.每次存完打印账户余额.
//1.是否是多线程问题?是，两个储户线程
//2.是否有共享数据?有， 账户(或账户余额)
//3.是否有线程安全问题？有
// 4.需要考虑如何解决线程安全问题?同步机制:有三种方式。

import java.util.concurrent.locks.ReentrantLock;

class Account{
    private double money;

    private ReentrantLock lock = new ReentrantLock();


    public Account(double money) {
        this.money = money;
    }
    //存钱
    //第一种：方法的synchronized 这里this指代的只有一个对象！！
//    public synchronized void deposit(double amt){
    public  void deposit(double amt){
        try {
            lock.lock();

        if(amt > 0){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            money +=amt;
            System.out.println(Thread.currentThread().getName()+":存钱成功，余额为："+money);
        }
        }finally {
            lock.unlock();
        }
    }
}
class Customer extends Thread{
    private  Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public  void run() {
            for (int i = 0; i < 3; i++) {
                acct.deposit(1000);
            }
    }
}

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);
        //此时两个线程共用同一个账户

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}
