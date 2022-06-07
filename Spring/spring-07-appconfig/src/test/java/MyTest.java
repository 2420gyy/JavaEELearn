import com.kuang.config.Myconfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.awt.AppContext;

public class MyTest {
    public static void main(String[] args) {
        //完全使用配置方法，通过AnnotationConfig 上下文获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.toString());
//      User user = context.getBean("user", User.class);
//      user.add();
    }
}
