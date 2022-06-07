import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user1 = context.getBean("user1", User.class);//可以不强转
        user1.show();
//        User user = (User) context.getBean("user");//强转
//        user.show();
//        UserT usert = (UserT) context.getBean("user2333");
//        usert.show();
    }
}
