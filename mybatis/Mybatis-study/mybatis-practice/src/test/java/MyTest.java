import com.chen.dao.UserMapper;
import com.chen.pojo.User;
import com.chen.utile.ChenMybtisUtile;
import com.chen.utile.Utile;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MyTest {
    @Test
    public void Test() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = factory.openSession();
        //
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectStudentById(1);
        System.out.println(user);
    }
    @Test
    public void Test2() throws IOException {
        Utile utile = new Utile();
        utile.getOne();//类方法？？？？？？
        SqlSession sqlSession = ChenMybtisUtile.getSqlSessionFactory();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int countstudent = mapper.countstudent();
        System.out.println(countstudent);
    }
}
