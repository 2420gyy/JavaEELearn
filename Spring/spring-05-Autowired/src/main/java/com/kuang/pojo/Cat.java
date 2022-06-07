package com.kuang.pojo;

import org.springframework.stereotype.Repository;

@Repository(value = "cat1")
public class Cat {
    public void shout() {
        System.out.println("miao~");
    }
}
