package day09_8_25_马士兵;

public class Test01 {
    static int a;
    
    public static void test01(){
        int b = 3;//必须赋初值
        System.out.println(b);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.run();//实例方法
        Person.eat();//静态方法

    }


}
