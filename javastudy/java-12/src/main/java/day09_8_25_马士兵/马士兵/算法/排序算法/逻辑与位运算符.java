package day09_8_25_马士兵.马士兵.算法.排序算法;

public class 逻辑与位运算符 {
    public static void main(String[] args) {
        //逻辑运算符
        // && || !
        int i=2,j=3;
        System.out.println((i<5)&&(j<5));
        System.out.println((i<3)||(j<3));
        System.out.println(!(i<j));
        System.out.println("===============================");

        //位运算符
        //位运算符是对long、int、short、byte和char这5种类型的数据进行运算的，我们不能对double、float和boolean进行位运算操作
        //1 0 1 0 1
        System.out.println(1&1);
        System.out.println(0&1);
        System.out.println(0|1);
        System.out.println(0|0);
        System.out.println(1|1);
        System.out.println("===============================");
        //异或运算符 一真一假为真
        //对于任意一个二进制位来说，这个位上的数与0进行异或运算，
        //运算结果与这个二进制位上的数是相同的，而与1进行异或运算，结果与这个二进制位上的数字相反
        System.out.println(1^1);
        System.out.println(1^0);
        System.out.println(0^0);

        System.out.println("===========取反============");
//         全部正整数的按位取反是其本身+1的负数
//         全部负整数的按位取反是其本身+1的绝对值
//         零的按位取反是 -1
        //~ 一元运算符 按位非运算后结果与输入位相反

//        001  1         0010 2 原 补 反  （补码取反输出）         10010 -2 符号位不变，将剩余位取反，得到反码，在反码的基础上最后一位加一得到负数的补码。
//                       1101 取反 实为补码                       11101 反 +1 -> 补码 11110
//                       1100 -> 1011                           取反 - 00001

//        110 -2
        System.out.println(~3);
        System.out.println(~0);
        System.out.println(~2);
        System.out.println(~(-2));

        System.out.println("==============位运算符的计算=================");
        System.out.println(5&6);//4
        System.out.println(5|6);//7
        System.out.println(5^6);//3
        //如果是对变量进行取反操作，那么经过操作之后，变量的值并不会发生变化！
        System.out.println(~5);//-6


        System.out.println("==============移位运算符=================");
        //左移运算符      0000-0000101 -> 00（舍弃）000-0000010100
        //左移是2的平方！！！ 5 * 2^2
        System.out.println(5<<2);//20

//        只要当中有一条数据是字符串类型，其他非字符串数据都将被转换为字符串形式并连接



    }
}
