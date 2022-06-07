package day09_8_25_马士兵.马士兵.数组;

public class test01 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //1.声明
        int[] arr;
        //2.创建
        arr = new int[4];
        int[]  arrayOfInt = new int[4];
        //3.赋值
        arr[0]=12;
        arr[1]=13;
        arr[2]=14;
        arr[3]=15;
        //4.使用
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //增强for循环
        for(int num:arr){
            System.out.println(num);
        }

        int[] arr2 = new int[]{1,2,3};
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
