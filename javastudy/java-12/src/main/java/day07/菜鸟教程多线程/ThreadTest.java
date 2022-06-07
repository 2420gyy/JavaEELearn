package day07.菜鸟教程多线程;

class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"=:="+i);
        }
    }
}



public class ThreadTest{
    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo();
        ThreadDemo threadDemo2 = new ThreadDemo();
        threadDemo1.setName("线程01");
        threadDemo2.setName("线程02");
        threadDemo1.start();
        threadDemo2.start();

    }

}
