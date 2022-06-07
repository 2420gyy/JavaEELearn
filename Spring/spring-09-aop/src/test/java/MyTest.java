import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口，不是实现类
        //UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        UserService userService = (UserService) context.getBean("userService");
        userService.select();
    }
}
