package com.kuang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kuang.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Autowired
    @Qualifier("myRedisTemplate")
    //这里重名默认走新配置的？？改了名字
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("key","val");//操作字符串

//        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
//        connection.flushDb();//获取连接，进行操作数据库的连接操作
        Object key = redisTemplate.opsForValue().get("key");
        System.out.println(key);
    }

    @Test
    public void test() throws JsonProcessingException {
        User user = new User("kuang", 3);
        //String jsonUser = new ObjectMapper().writeValueAsString(user);//序列化
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
