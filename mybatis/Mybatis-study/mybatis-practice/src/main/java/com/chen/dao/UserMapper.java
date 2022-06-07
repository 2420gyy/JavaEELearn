package com.chen.dao;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from student where sid=#{id}")
    User selectStudentById(@Param("id") int sid);

    @Select("select count(*) from student")
    int countstudent();
}
