package day07.测试;

public class A {
    public static void main(String[] args) {
        C c = new C();
        c.run();


    }
    static class C extends B{
        int age;

        //如果编写一个构造方法，既没有调用 super() 也没有调用 this()，
        // 编译器会自动插入一个调用到父类构造方法中，而且不带参数。  ???
        public C() {
        }

        public C(int age) {
            this.age = age;
        }

        public void run(){
            System.out.println(super.b);
            System.out.println(super.getA());
            System.out.println(this.getName());
        }
    }
}
