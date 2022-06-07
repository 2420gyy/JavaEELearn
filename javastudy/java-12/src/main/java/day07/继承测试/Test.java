package day07.继承测试;

public class Test {
    public static void main(String[] args) {
        show(new Cat());  // 以 Cat 对象调用 show 方法
        show(new Dog());  // 以 Dog 对象调用 show 方法

        Animal a = new Cat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat c = (Cat)a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work

        new Cat(4);
//        tes();
    }
    public void tes(){
        System.out.println("1.静态只能访问静态;2.非静态可以访问静态的和非静态的");
    }


    public static void show(Animal a)  {
        a.eat();
        // 类型判断
        if (a instanceof Cat)  {  // 猫做的事情
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog c = (Dog)a;
            c.work();
        }
    }
}

abstract class Animal {
    //抽象方法不能有方法体
    private int a=4;

    public Animal(int a) {
        this.a = a;
    }

    public Animal() {
    }

    abstract void eat();
    //final修饰的方法不能重写，修饰的类也不能继承（最终的类，方法）
     void work(){
        System.out.println("抽象类的非抽象方法必须有方法体");
    };
}

class Cat extends Animal {
    public Cat() {
//        super(3);
    }

    public Cat(int a) {
        super(a);
        System.out.println(a);
    }

    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
//    public Dog(int a) {
//        super(a);
//    }

    public Dog() {
        super(3);
    }

    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
