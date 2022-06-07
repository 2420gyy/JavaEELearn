package day07.继承测试;

public class 跳出多重循环 {

    public static void main(String[] args) {
        ok:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==4 && j==4){
                    break ok;
                }else {
                    System.out.println(i+":"+j);
                }
            }
        }
    }
}
