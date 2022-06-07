import com.kuang.mapper.UserMapper;
import com.kuang.mapper.UserMapperImpl;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.selectUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//       执行UserMapper但是，现在有实现类UserMapperImpl 调selectUser() 在spring里面叫userMapper

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
//        for (User user : userMapper.selectUser()) {
//            System.out.println(user);
//        }
        //这个还是失败 -- 成功！！！！！！UMI2里面没写返回值，用第一种方法的sqlsessoin？？
        User userById = userMapper.getUserById(1);
        System.out.println(userById);


    }

}
