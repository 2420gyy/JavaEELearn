package day09_8_25_马士兵.马士兵.算法.排序算法;

public class 一个陷阱 {
    public static void main(String[] args) {
        boolean x=true,y=true;
        //x=y 是一个逻辑表达式
        while (x = y){
            int i;
            for (i = 0; i < 5; i++) {
                System.out.println(i);
            }
            if(i==5)break;
        }

        //分辨
        //逻辑运算符 && （AND）、||（OR）和 !（非）根据参数的逻辑关系生成布尔值 true 或 false

        //我们将 Boolean 类型被视为“单位值”（one-bit value），所以它多少有些独特的地方。
        // 我们可以对 boolean 型变量执行与、或、异或运算，但不能执行非运算（大概是为了避免与逻辑“非”混淆）。
        // 对于布尔值，位运算符具有与逻辑运算符相同的效果，只是它们不会中途“短路”。
        // 此外，针对布尔值进行的位运算为我们新增了一个“异或”逻辑运算符，它并未包括在逻辑运算符的列表中。
        // 在移位表达式中，禁止使用布尔值，原因将在下面解释。
    }
}
