package day07;

public class Test01 {
    public static void main(String[] args) {
        //work_1();
        //System.out.println(work_2());
        work_3();
    }
    public static void work_1(){
        String a[] = {"黑桃","红桃","梅花","方片"};
        String b[] = {"1","2","3","4","J","Q","K"};
            for(int j=0;j<a.length;j++){
                for (int k = 0; k < b.length; k++) {
                    System.out.print(a[j] + b[k] + " ");
                }
                System.out.println();
        }
    }
    public static boolean work_2(){
//        当变成传参后注意情况的判断
        int[] arr = {1,2,3,4,4,3,2,1};
        boolean flag = true;
        int i=0;
        while (true){
            if(arr[i]==arr[arr.length-1-i]){
                i++;
                if(i==arr.length/2) break;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void work_3(){
        int a;
    }
}
