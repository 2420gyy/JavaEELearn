package java8新特性.Lambda;

import org.junit.Test;

public class LambdaTest01 {
    public static void main(String[] args) {

        goShow( () -> {
            System.out.println("show方法被执行了");
        });
    }
    public static void goShow(UserService userService){
        System.out.println("@@@@@@@@");
        userService.show();
        System.out.println("@@@@@@@@");
    }

}
