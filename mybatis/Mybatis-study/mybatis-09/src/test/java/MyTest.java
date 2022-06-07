import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.quaryUsersById(1);
        System.out.println(user);
        sqlSession.close();
        //一级缓存默认开启
        //mapper.updataUser(new User(2,"lala","1234",12));//缓存被刷新 做了增删改操作后
        //sqlSession.clearCache();//手动清理缓冲

        //先后顺序 二级--一级--数据库
        //缓存，提高查询效率
        User user2 = mapper2.quaryUsersById(1);
        System.out.println(user2);
        User user3 = mapper2.quaryUsersById(2);
        System.out.println(user3);

        System.out.println(user == user2);

        sqlSession2.close();
    }
}
