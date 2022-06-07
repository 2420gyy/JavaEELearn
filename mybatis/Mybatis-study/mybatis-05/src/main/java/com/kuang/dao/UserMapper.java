package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//接口！！！！！！！！！！！
public interface UserMapper {//dao 等价于mapper

    @Select("select * from user")
    List<User> getUsers(); //原来要获取全部用户，写xml文件

    @Select("select * from user where id = #{qid}")
    User getUserById(@Param("qid") int id);

    @Insert("insert into user(id,name,pwd,age) values (#{id},#{name},#{password},#{age})")
    int addUser(User user);


    @Update("update user set name=#{name},pwd=#{password},age=#{age} where id = #{id}")
    int updateUser(User user);


    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);

}
