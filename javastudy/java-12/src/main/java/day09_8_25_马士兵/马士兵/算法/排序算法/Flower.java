package day09_8_25_马士兵.马士兵.算法.排序算法;

public class Flower {
//    编译器不允许你在一个构造器之外的方法里调用构造器。
    // housekeeping/Flower.java
// Calling constructors with "this"
        int petalCount = 0;
        String s = "initial value";
        Flower(int petals) {
            petalCount = petals;
            System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
        }
        Flower(String ss) {
            System.out.println("Constructor w/ string arg only, s = " + ss);
            s = ss;
        }
        Flower(String s, int petals) {
            this(petals);
            //- this(s); // Can't call two!
            this.s = s; // Another use of "this"
            System.out.println("String & int args");
        }
        Flower() {
            this("hi", 47);
            System.out.println("no-arg constructor");
        }
        void printPetalCount() {
            //this(11); // Not inside constructor!
            System.out.println("petalCount = " + petalCount + " s = " + s);
        }
        public static void main(String[] args) {
            Flower x = new Flower();
            x.printPetalCount();
        }
    }
