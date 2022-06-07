package com.atgui.admin;

import com.atgui.admin.bean.User;
import com.atgui.admin.mapper.UserMapper;
import com.atgui.admin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
@Slf4j
@SpringBootTest
class SpringBootAdmin02ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from student");
        System.out.println(mapList);
        //[{id=1, name=李四, age=20}, {id=2, name=张三, age=22}, {id=3, name=小明, age=29}]
        log.info("数据源类型：{}",dataSource.getClass());
    }

    @Test
    void testUserMapper(){
//
        try {
            User user = userService.getById(2);
            log.info("用户信息：{}", user);
            log.info(String.valueOf(user));
            log.info(user.toString());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    private RedisTemplate<String,String> redisTemplate2;
    @Test
    void testRedis(){
        ValueOperations<String, String> operations = redisTemplate.opsForValue();

        redisTemplate2.opsForValue().set("hello2","world2");


        operations.set("hello","world");

        String hello = operations.get("hello");
        System.out.println(hello);
    }



}
