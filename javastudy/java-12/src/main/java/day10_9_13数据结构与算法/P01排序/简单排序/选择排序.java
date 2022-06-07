package day10_9_13数据结构与算法.P01排序.简单排序;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {4,6,8,7,9,2,10,1};
        //默认第一个元素的索引处值为最小，有大的就和他交换索引
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]) {
                    min = j;
                }
                if(j==arr.length-1){
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

}
