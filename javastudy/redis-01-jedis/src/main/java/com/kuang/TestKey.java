package com.kuang;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestKey {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        System.out.println("清空数据"+jedis.flushDB());
        System.out.println("判断键是否存在"+jedis.exists("username"));
        System.out.println("新增键值对"+jedis.set("username","kuang"));
        System.out.println("新增键值对"+jedis.set("age","24"));
        Set<String> keys = jedis.keys("*");
        System.out.println(keys);

        System.out.println("删除键"+jedis.del("age"));
        System.out.println("查看键存储的值的类型"+jedis.type("username"));
        System.out.println("随机返回一个"+jedis.randomKey());
        System.out.println("重命名"+jedis.rename("username","newname"));
        System.out.println("修改后的"+jedis.get("newname"));
        //System.out.println("切换数据库"+jedis.select(0));
        System.out.println("查看key的数量"+jedis.dbSize());


    }
}
