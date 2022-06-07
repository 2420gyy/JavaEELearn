package day10_9_13数据结构与算法.P01排序.简单排序;

import java.util.ArrayList;

public class 冒泡排序 {
    public static void main(String[] args) {
    int[] arr = {4,5,6,3,2,1};
    int i,j,k;
    for (i=0;i<arr.length-1;i++) {
        //每排完一次就完成一个元素的排序
        for (j=0;j<arr.length-1-i;j++) {
            //相邻！！！！
            if(arr[j]>arr[j+1]){//注意+1的问题
            k=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=k;
            }
        }
    }
    for (int i1 = 0; i1 < arr.length; i1++) {
        System.out.println(arr[i1]);
    }

  }
}
