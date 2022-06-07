package com.atgui.admin;

import com.atgui.admin.service.UserService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@SpringBootTest
@DisplayName("junit5功能测试类")
public class Junit5Test {

    @DisplayName("testDisplayName()方法")
    @Test
    void testDisplayName(){
        System.out.println(1);
    }
//    表示测试类或测试方法不执行，类似于JUnit4中的@Ignore
    @Disabled
    @DisplayName("testDisplayName2()方法")
    @Test
    void testDisabled(){
        System.out.println(2);
    }

    @BeforeEach
    void testBeforEach(){
        System.out.println("单个测试执行前执行的。。。");
    }
    @AfterEach
    void afterEach(){
        System.out.println("单个测试结束了。。。");
    }
    @BeforeAll
    static void testBeforeAll(){
        System.out.println("表示在所有单元测试之前执行（只有一次，加了static）");
    }
    @AfterAll
    static void testAfterAll(){
        System.out.println("表示在所有单元测试之后执行");
    }
//    @Timeout :表示测试方法运行如果超过了指定时间将会返回错误
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)
    @Test
    void testTimeout() throws InterruptedException {
        Thread.sleep(500);
    }
//    当前没有spring的测试功能。没有autowired。。。

    @RepeatedTest(5)
    @Test
    void test3(){
        System.out.println(5);
    }
//    @Transactional
    @Autowired
    UserService userService;

    @Transactional
    @Test
    public void testTransactional(){
        userService.removeById(4);
        System.out.println("Transactional删除测试完成");
    }

}
