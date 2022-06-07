package day07.枚举;

public class Test {
    enum Color1
    {
        RED, GREEN, BLUE;
    }
    // 执行输出结果
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
        Color1 blue = Color1.BLUE;
        System.out.println(blue);
        Color1 red = Color1.valueOf("RED");
        System.out.println("====="+red);
        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }

        Color1 blue1 = Color1.BLUE;

    }
}
