package day08;

import day08.config.iocConfig;
import day08.config.iocConfig2;
import day08.service.serviceTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(iocConfig.class);
        serviceTest serviceTest = applicationContext.getBean(serviceTest.class);
        serviceTest.test();
    }
}
