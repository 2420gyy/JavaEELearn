package day09_8_25_马士兵.马士兵.集合容器.project;

import java.util.Scanner;


public class HotelSystem {
    public static void main(String[] args) {
        while(true){
            System.out.println("【1】添加房间 【2】修改房间状态 【3】修改房间类型 【4】查询房间信息 【-1】退出系统");
            int menu = getInt();
            if(menu==-1){
                System.out.println("退出系统");
                break;
            }
            //校验
            boolean isCheck = check(menu);
            if(!isCheck){
                System.out.println("输入非法");
                continue;
            }
            process(menu);
        }
    }
    //校验
    public static boolean check(int menu){
        if(menu>=1 && menu <=4){
            return true;
        }
        return false;
    }
    public static void process(int menu){
        if(menu==1){
            System.out.println("添加房间");
        }else if(menu==2){
            System.out.println("修改房间状态");
        }else if(menu==3){
            System.out.println("修改房间类型");
        }else if(menu==4){
            System.out.println("查询房间信息");
        }
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
