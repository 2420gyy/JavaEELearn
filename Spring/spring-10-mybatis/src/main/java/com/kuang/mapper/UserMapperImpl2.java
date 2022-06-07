package com.kuang.mapper;


import com.kuang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public User getUserById(int userId) {
        //同下面
        return null;
    }

    @Override
    public List<User> selectUser() {
        // 省掉注入过程 --写完一个类，用了spring，就注入到spring，在applicXXX。xml
//        SqlSession sqlSession = getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.selectUser();
        return getSqlSession().getMapper(UserMapper.class).selectUser();

    }
}
