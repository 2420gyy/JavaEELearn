package day10_9_13数据结构与算法.P01排序.简单排序;

public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,10,12,1,5,6};
        //元素分为两组，已排序和未排序
        //每次从未排序中找到一个元素插入已排序中
        for(int i=1;i<arr.length;i++){
            //这里逆序比较排好的顺序，然后插入
            for (int j=i;j>0;j--){
                //比较j和j-1的值
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}
