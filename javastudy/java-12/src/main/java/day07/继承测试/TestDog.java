package day07.继承测试;

class Animal1{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog1 extends Animal1{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

public class TestDog{
    public static void main(String args[]){
        Animal1 a = new Animal1(); // Animal 对象
        Animal1 b = new Dog1(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法 编译时是父类的，但是运行时是子类对象的方法
//        b.bark();
    }
}
