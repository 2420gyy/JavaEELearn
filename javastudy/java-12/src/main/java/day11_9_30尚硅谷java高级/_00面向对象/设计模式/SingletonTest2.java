package day11_9_30尚硅谷java高级._00面向对象.设计模式;

//懒汉式
//什么时候用什么时候new
public class SingletonTest2 {
    public static void main(String[] args) {

        Order instance1 = Order.getInstance();
        Order instance2 = Order.getInstance();
    }
}
class Order{
    public Order() {
    }
    private static Order instance = null;
    public static Order getInstance(){
        if(instance == null){
            instance =  new Order();
        }
        return instance;
    }
}
