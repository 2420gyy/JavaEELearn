package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//mybatis-plus 通用mapper
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    //我们所有操作都使用sqlSession来执行，现在用XXXtemplate.
    //理解这个。。。！！！！！
//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }


    @Override
    public User getUserById(int userId) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUserById(userId);
    }

    //@Select("select * from mybatis.user")//完全舍弃mapper怎么做？？？上面
    public List<User> selectUser() {
        User user = new User(9, "xaiomei", "2333", 23);

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        //没有添加事物管理-就没有原子性
        mapper.addUser(user);
        mapper.deleteUser(8);

        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int Id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(Id);
    }

}
