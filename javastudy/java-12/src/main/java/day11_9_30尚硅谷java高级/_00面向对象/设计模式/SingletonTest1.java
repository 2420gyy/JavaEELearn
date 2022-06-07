package day11_9_30尚硅谷java高级._00面向对象.设计模式;

//饿汉式
//一上来就造好了
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank = Bank.GetInstance();
    }

}

class Bank{
    //1.私有化构造器
    private Bank() {
    }
    //内部创建类的对象
    private static Bank instance = new Bank();
    public static synchronized Bank GetInstance(){
        return instance;
    }

}
