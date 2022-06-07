import com.kuang.pojo.Hello;
import com.kuang.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext appplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");//applicationContext.xml
        //对象在spring中，要使用直接取出来
        Hello hello = (Hello) appplicationContext.getBean("hello");
        //Object hello = appplicationContext.getBean("hello");另一种写法
        System.out.println(hello.toString());//XXX.sout 快捷方式

        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloService.class);
        Hello hello1 = ctx.getBean("hello",Hello.class);
        System.out.println(hello1);
    }
}
