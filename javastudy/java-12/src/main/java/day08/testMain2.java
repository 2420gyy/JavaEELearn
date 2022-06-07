package day08;

import day08.config.iocConfig;
import day08.config.iocConfig2;
import day08.config.iocConfig3;
import day08.service.serviceTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testMain2 {
    public static void main(String[] args) {
//        关于上下文的自动运行方法（bean）的问题，实例化后自动调用？？
        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(iocConfig3.class);
        iocConfig2 iocConfig2 = applicationContext2.getBean(iocConfig2.class);
        System.out.println(applicationContext2.isSingleton("iocConfig2"));
        //iocConfig2.test();
        iocConfig2.accountDao().test();
    }
}
