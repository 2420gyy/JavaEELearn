package com.kuang;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


public class TestJedisPool {
    public static void main(String[] args) {
        GenericObjectPoolConfig PoolConfig = new GenericObjectPoolConfig();
        JedisPool jedisPool = new JedisPool(PoolConfig, "127.0.0.1", 6379);
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            jedis.set("hello","world");
            System.out.println(jedis.get("hello"));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (jedis !=null){
                jedis.close();
            }
        }
        if(jedisPool!=null){
            jedisPool.close();
        }
    }
}
