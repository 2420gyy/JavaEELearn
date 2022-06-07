import com.chen.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person person = context.getBean("person", Person.class);
        //System.out.println(person.toString());
        person.getCat().shout();//一开始也没想到，get的作用和这个整个调用流程，java！！！
        person.getDog().shout();
    }
}
