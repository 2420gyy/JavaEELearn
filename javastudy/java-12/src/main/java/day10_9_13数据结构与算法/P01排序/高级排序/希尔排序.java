package day10_9_13数据结构与算法.P01排序.高级排序;

public class 希尔排序 {
    //shell
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};
        //确定增长量的值
        int h=1;
        while(h<arr.length/2){
            h=2*h+1;
        }
        while(h>=1){
            //排序
            //注意步长
            for (int i = h;i<arr.length;i++){
                for (int j = i; j>=h;j-=h) {
                    if(arr[j]<arr[j-h]){
                        int temp = arr[j];
                        arr[j] = arr[j-h];
                        arr[j-h] =temp;
                }else {break;}
                }
            }
            //减小h的值
            h=h/2;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
