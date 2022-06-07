package day09_8_25_马士兵.马士兵.算法.排序算法;

// control/LabeledFor.java
// 搭配“标签 break”的 for 循环中使用 break 和 continue
public class LabeledFor {
    public static void main(String[] args) {

//        简单的一个 continue 会退回最内层循环的开头（顶部），并继续执行。
//        带有标签的 continue 会到达标签的位置，并重新进入紧接在那个标签后面的循环。
//        break 会中断当前循环，并移离当前标签的末尾。
//        带标签的 break 会中断当前循环，并移离由那个标签指示的循环的末尾。
//        大家要记住的重点是：在 Java 里需要使用标签的唯一理由就是因为有循环嵌套存在，而且想从多层嵌套中 break 或 continue。

        int i = 0;
        outer: // 此处不允许存在执行语句
        for(; true ;) { // 无限循环
            inner: // 此处不允许存在执行语句
            for(; i < 10; i++) {
                System.out.println("i = " + i);
                if(i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if(i == 3) {
                    System.out.println("break");
                    i++; // 否则 i 永远无法获得自增
                    // 获得自增
                    break;
                }
                if(i == 7) {
                    System.out.println("continue outer");
                    i++;  // 否则 i 永远无法获得自增
                    // 获得自增
                    continue outer;
                }
                if(i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for(int k = 0; k < 5; k++) {
                    if(k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        // 在此处无法 break 或 continue 标签
    }
}