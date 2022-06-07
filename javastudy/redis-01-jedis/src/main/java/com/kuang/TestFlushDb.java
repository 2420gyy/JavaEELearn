package com.kuang;

import redis.clients.jedis.Jedis;

public class TestFlushDb {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.flushDB();
        System.out.println("数据库清空完成");
    }

}
