package com.kuang;

import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args) {
        //1. new jedis 对象
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //jedis.auth("123456");
        //jedis 所有的命令都在里面,指令都是方法
        System.out.println(jedis.ping());

    }
}
