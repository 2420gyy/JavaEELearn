package day07.DI注入测试;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chenchen
 * @date 2021-11-13 9:25
 */
@Component
public class SimpleTest {

    @Resource(name = "SvcA")
    Svc svc;

    @Test
    public void test1(){
        Assert.assertNotNull("svc");
        svc.sayHello();
    }

}
