package day07.DI注入测试;

import org.springframework.stereotype.Service;

/**
 * @author chenchen
 * @date 2021-11-13 9:24
 */
@Service
public class SvcC implements Svc{
    @Override
    public void sayHello() {
        System.out.println("C");
    }
}
