package OnJava8;

import org.junit.Test;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/**
 * @author chenchen
 * @date 2022-03-21 19:19
 */
public class lambdatest {
    @Test
    public void test1(){
        process(new Runnable() {
            @Override
            public void run() {
                System.out.println("sss");
            }
        });
        // 不接受参数且返回void
        process(() -> System.out.println("sss"));
        System.out.println("======");
    }
    @Test
    public void test2(){
        // 在输入和输出都是原始类型时避免装箱操作
        IntPredicate intPredicate = (int i) -> i%2 == 0;
        boolean test = intPredicate.test(1000);
        System.out.println(test);
        //
        IntBinaryOperator intBinaryOperator = (int a,int b) -> a*b;
        int anInt = intBinaryOperator.applyAsInt(3, 4);

    }

    public void process(Runnable r){
        r.run();
    }
}
