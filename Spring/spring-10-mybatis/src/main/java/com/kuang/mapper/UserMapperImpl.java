package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

//mybatis-plus 通用mapper
public class UserMapperImpl implements UserMapper {
    //我们所有操作都使用sqlSession来执行，现在用XXXtemplate.
    //理解这个。。。！！！！！
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User getUserById(int userId) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserById(userId);
    }

    //@Select("select * from mybatis.user")//完全舍弃mapper怎么做？？？上面
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

}
