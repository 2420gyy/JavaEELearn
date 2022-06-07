import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取applicationcontext 拿到spring的容器  快捷方式 CPX
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //需要什么，get什么   下方是强转

        UserServiceImpl service = (UserServiceImpl) context.getBean("service");
        service.getUser();
    }
}
/*
 使用spring容器后，舍弃

         //用户实际调用的是业务层，不接触dao层
        //每增加一个要求，要改new后面的
        UserServiceImpl userSerivce =  new UserServiceImpl();

        userSerivce.setUserDao(new UserDaoImpl());
        // userSerivce.setUserDao(new UserDaoMysqlImpl());
        userSerivce.getUser();

*/