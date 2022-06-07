package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {


    User quaryUsersById(@Param("id") int id);

    @Update("update mybatis.user set name=#{name},pwd=#{pwd},age=#{age} where id=#{id}")
    void updataUser(User user);//不用写@Param("user")
}
