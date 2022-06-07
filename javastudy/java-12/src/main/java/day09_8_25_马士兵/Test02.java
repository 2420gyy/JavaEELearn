package day09_8_25_马士兵;

public class Test02 {
    public static void main(String[] args) {
        //String 类中重写了 equals () 方法用于比较两个字符串的内容是否相等
        String a = new String("ab"); // a ԅӞӻ୚አ
        String b = new String("ab"); // b ,አ୚ӻӞݚԅ ੒᨝ጱٖ਻Ӟ໏
        String aa = "ab"; // නࣁଉᰁ࿰Ӿ
        String bb = "ab"; // ՗ଉᰁ࿰Ӿັತ
        if (aa == bb) // true
            System.out.println("aa==bb");
        if (a == b) // false᨝੒Ӟݶᶋ҅
            System.out.println("a==b");
        if (a.equals(b)) // true
            System.out.println("aEQb");
        if (42 == 42.0) { // true
            System.out.println("true");
        }
    }
}
