package com.atgui.admin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AssertionsTest {

    @DisplayName("测试简单断言")
    @Test
    void testSimpleAssertions(){
        int cal = cal(3,2);
//        静态的方法。。。
        assertEquals(6,cal,"业务逻辑计算失败");
        assertEquals(3, 1 + 2, "simple math");
        assertNotEquals(3, 1 + 1);

        assertNotSame(new Object(), new Object());
        Object obj = new Object();
        assertSame(obj, obj);

        assertFalse(1 > 2);
        assertTrue(1 < 2);

        assertNull(null);
        assertNotNull(new Object());
    }
    int cal(int a,int b){
        return a+b;
    }
//    通过 assertArrayEquals 方法来判断两个对象或原始类型的数组是否相等
    @Test
    @DisplayName("array assertion")
    public void array() {
        assertArrayEquals(new int[]{1, 2}, new int[] {1, 2},"数组不相等");
    }
//    组合断言
    @Test
    @DisplayName("assert all")
    public void all() {
//        可变数组，接口是函数式接口
        assertAll("Math",
                () -> assertEquals(2, 1 + 1,"结果不满足预期"),
                () -> assertTrue(1 > 0,"结果不满足预期")
        );
    }
//    异常断言，一定会有一个异常
@Test
@DisplayName("异常测试")
public void exceptionTest() {
ArithmeticException exception = Assertions.assertThrows(
        //扔出断言异常
        ArithmeticException.class, () -> {int i =10/0;},"业务逻辑居然正常运行");
}
    @Test
    @DisplayName("超时测试")
    public void timeoutTest() {
        //如果测试方法时间超过1s将会异常
        Assertions.assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(500));
    }
//    直接使得测试失败
    @Test
    @DisplayName("快速失败")
    public void shouldFail() {
        if(2==1) {
            fail("This should fail");
        }
    }

    /**
     * 测试前置条件
     * 不满足的断言会使得测试方法失败，而不满足的前置条件只会使得测试方法的执行终止
     * 前置条件可以看成是测试方法执行的前提，当该前提不满足时，就没有继续执行的必要。
     */
    @DisplayName("前置条件")
    @Test
    void testAssumptions(){
        Assumptions.assumeTrue(false,"结果不是true");
        System.out.println("1111");//ignored

    }
//    前置条件不满足会跳过，断言不满足会报失败
    @DisplayName("断言")
    @Test
    void testAssertions(){
        Assertions.assertTrue(1>2,"结果不是true");
        System.out.println("1111");//failed
    }


}
