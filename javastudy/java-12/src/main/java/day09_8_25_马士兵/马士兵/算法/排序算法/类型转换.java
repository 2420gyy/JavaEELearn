package day09_8_25_马士兵.马士兵.算法.排序算法;

public class 类型转换 {
    public static void main(String[] args) {
        //若将数据类型进行“向下转换”（Narrowing Conversion）的操作（将容量较大的数据类型转换成容量较小的类型），
        // 可能会发生信息丢失的危险。此时，编译器会强迫我们进行转型
        //对于“向上转换”（Widening conversion），则不必进行显式的类型转换，因为较大类型的数据肯定能容纳较小类型的数据，
        // 不会造成任何信息的丢失。

        //若你想对结果进行四舍五入，可以使用 java.lang.Math 的 round() 方法：
//        常规情况下
//        例：
//        Math.round(11.6) = 12；Math.round(-11.6) = -12；
//        Math.round(-0.1) = 0；Math.round(0.1) = 0；

//        如果出现向上向下距离一样的数值
//        例：
//        Math.round(11.5) ，首先与 11.5最接近的有两个整数 11 和 12，取较大的那个，结果就是12；
//        Math.round(-11.5)，首先与 -11.5最接近的有两个整数 -11 和 -12，取较大的那个，结果就是-11；

//        三个特例
//        如果参数为 NaN（无穷与非数值），那么结果为 0。
//        如果参数为负无穷大或任何小于等于 Long.MIN_VALUE 的值，那么结果等于Long.MIN_VALUE 的值。
//        如果参数为正无穷大或任何大于等于 Long.MAX_VALUE 的值，那么结果等于Long.MAX_VALUE 的值。

        //类型提升：
        //如果我们对小于 int 的基本数据类型（即 char、byte 或 short）执行任何算术或按位操作，
        // 这些值会在执行操作之前类型提升为 int，并且结果值的类型为 int。

        //表达式中最大的数据类型是决定表达式结果的数据类型。float 型和 double 型相乘，
        // 结果是 double 型的；int 和 long 相加，结果是 long 型。
    }
}
