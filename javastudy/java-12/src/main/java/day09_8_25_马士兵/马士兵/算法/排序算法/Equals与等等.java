package day09_8_25_马士兵.马士兵.算法.排序算法;

public class Equals与等等 {
    int i;
    public static void main(String[] args) {
        //对于字符串变量
        String s1,s2,s3 = "abc", s4 ="abc" ;
        s1 = new String("abc");
        s2 = new String("abc");
        //“==”比较两个变量本身的值，即两个对象在内存中的首地址。false
        System.out.println(s1 == s2);
        //“equals()”比较字符串中所包含的内容是否相同。true
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        //true
        System.out.println("s3==s4:" + (s3 == s4));

        System.out.println("===============================");

        StringBuffer s11 = new StringBuffer("a");
        StringBuffer s22 = new StringBuffer("a");
        //StringBuffer类中没有重新定义equals这个方法(等价==比较对象的首地址)，因此这个方法就来自Object类，
        //覆盖了则比较对象的内容
        // (Object类中的equals方法是用来比较“地址”的，所以等于false)
        System.out.println("s1.equals(s2):"+(s11.equals(s22)));//结果为false


        System.out.println("===============================");

        Equals与等等 a1 = new Equals与等等();
        Equals与等等 a2 = new Equals与等等();
        System.out.println("相互赋值(a1=a2)前");
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println("相互赋值(a1=a2)后");
        a1=a2;
        //对于非字符串变量来说，"=="和"equals"方法的作用是相同的都是用来比较其，
        // 对象在堆内存的首地址，即用来比较两个引用变量是否指向同一个对象。
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));

        // 1、equals方法对于字符串来说是比较内容的，而对于非字符串来说是比较，其指向的对象是否相同的。
        // 2、 == 比较符也是比较指向的对象是否相同的也就是对象在对内存中的的首地址。
        //  String类中重新定义了equals这个方法，而且比较的是值，而不是地址。所以是true。

        System.out.println("===============================");
        //如果是基本类型比较，那么只能用==来比较，不能用equals
        //对于基本类型的包装类型，比如Boolean、Character、Byte、Shot、Integer、
        // Long、Float、Double等的引用变量，==是比较地址的，而equals是比较内容的。
        Integer n1 = 30;
        Integer n2 = new Integer(30);
        Integer n3 = new Integer(31);
        System.out.println(n1 == n2);//结果是false 两个不同的Integer对象，故其地址不同，
        System.out.println(n1 == n3);//那么不管是new Integer(30)还是new Integer(31) 结果都显示false
        System.out.println(n1.equals(n2));//结果是true 根据jdk文档中的说明，n1与n2指向的对象中的内容是相等的，都是30，故equals比较后结果是true
        System.out.println(n1.equals(n3));//结果是false 因对象内容不一样，一个是30一个是31


        System.out.println("===============================");
        // 注意：对于String(字符串)、StringBuffer(线程安全的可变字符序列)、StringBuilder(可变字符序列)这三个类作进一步的说明。
//        int i=0;
        Equals与等等 v1 = new Equals与等等();
        Equals与等等 v2 = new Equals与等等();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2)); //（1）false
        System.out.println(v1 == v2); //（2）false
        // 解释：不错，如果在新类中被覆盖了equals方法，就可以用来比较内容的。但是在上面的例子中类Equals与等等并没有覆盖Object中的equals方法，
        // 而是继承了该方法，因此它就是被用来比较地址的，又v1和v2的所指向的对象不相同，故标记（1）处的v1.equals(v2)运行结果为false，标记为（2）处的v1 == v2运行结果也为false。
        // 如果是基本类型比较，那么只能用==来比较，不能用equals ，如果是基本类型的包装类型,那么用equals
    }
}
