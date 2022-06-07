package com.kuang;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class TestPipeline {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        Pipeline pipelined = jedis.pipelined();
        pipelined.set("aa","bb");
        pipelined.incr("counter");
        pipelined.set("he","wo");
        List<Object> objects = pipelined.syncAndReturnAll();
        for (Object object : objects) {
            System.out.println(object);
        }
        List<String> a = new ArrayList<>();
        a.add("aa");
        a.add("counter");
        TestPipeline.mdel(a);
    }
    public static void mdel(List<String> keys){
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        Pipeline pipelined = jedis.pipelined();
        for(String key : keys){
            pipelined.del(key);
        }
        pipelined.sync();

    }
}
