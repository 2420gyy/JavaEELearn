package day07.继承测试;

public class BigImpl implements Big{
    @Override
    public void run1() {
        System.out.println("run");
    }

    @Override
    public int sun(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        BigImpl big = new BigImpl();
        big.run1();
    }
}
