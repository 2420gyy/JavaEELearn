package day07.测试;

public class IntegerTest {
    public static void main(String[] args) {
        int m = 500;
        Integer obj = new Integer(m);  // 手动装箱
        int n = obj.intValue();  // 手动拆箱
        System.out.println("n = " + n);

        Integer obj1 = new Integer(500);
        Integer obj2 = new Integer(501);

        System.out.println("obj 等价于 obj1？" + obj.equals(obj1));
        System.out.println("obj 等价于 obj1？" + obj1.compareTo(obj2));
//        System.out.println("obj 等价于 obj1？" + obj1==obj2);

    }
}
