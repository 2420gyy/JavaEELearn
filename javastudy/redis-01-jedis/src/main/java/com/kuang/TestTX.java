package com.kuang;

import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TestTX {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        JSONObject jsonObject = new JSONObject();
        jedis.flushDB();
        jsonObject.put("hello", "world");
        jsonObject.put("name", "kuang");
        //开启事务
        Transaction multi = jedis.multi();
        String s = jsonObject.toJSONString();
        //String watch = jedis.watch(s);
        try {//ctrl+alt+t
            multi.set("user1", s);
            multi.set("user2", s);
            int i = 1 / 0;//代码异常
            multi.exec();//事务的执行
        } catch (Exception e) {
            multi.discard();//事物的放弃
            e.printStackTrace();
        } finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close();
        }

    }
}
