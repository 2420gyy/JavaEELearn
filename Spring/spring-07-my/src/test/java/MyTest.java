import com.chen.config.SpringConfig;
import com.chen.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
        User getUser = context.getBean("getUser", User.class);
        getUser.test();
        //new SpringConfig().sleep();


    }
}
