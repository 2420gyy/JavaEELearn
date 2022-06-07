package day09_8_25_马士兵.马士兵.算法.排序算法;

public class 字符串运算符 {
        public static void main(String[] args) {
            //只要当中有一条数据是字符串类型，其他非字符串数据都将被转换为字符串形式并连接

            int x = 0, y = 1, z = 2;
            String s = "x, y, z ";
            System.out.println(s + x + y + z);
            // 将 x 转换为字符串
            System.out.println(x + " " + s);
            s += "(summed) = ";
            // 级联操作 使用括号表示优先级
            System.out.println(s + (x + y + z));
            // Integer.toString()方法的简写:
            //以代替繁琐的显式调用方法（如这里可以使用 Integer.toString())
            System.out.println("" + x);
        }
}
