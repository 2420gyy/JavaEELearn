package day07.测试;

public class Demo {
    public static void main(String[] args) {
        B b = new B(new A());
    }

    static class A {
        public A() {
            //需要在某些完全分离的类中调用一个方法，并将当前对象的一个引用作为参数传递时
            new B(this).print();  // 匿名对象
            //匿名对象就是没有名字的对象。如果对象只使用一次，就可以作为匿名对象，
            // 代码中 new B(this).print(); 等价于 ( new B(this) ).print();，先通过 new B(this) 创建一个没有名字的对象，再调用它的方法。
        }

        public void print() {
            System.out.println("Hello from A!");
        }
    }

    static  class B {
        A a;

        public B(A a) {
            this.a = a;
        }

        public void print() {
            a.print();
            System.out.println("Hello from B!");
        }
    }
}
