package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //这个要用mapper <!--    绑定接口--> 搞不懂？？？
    @Select("SELECT * FROM mybatis.user WHERE id = #{userId}")
    public User getUserById(@Param("userId") int userId);

    public List<User> selectUser();

    //添加用户
    public int addUser(User user);

    //删除用户
    public int deleteUser(int Id);
}
