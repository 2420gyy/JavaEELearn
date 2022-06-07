package com.bjpower;

import com.bjpower.rntity.Province;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {
    public static void main(String[] args) throws JsonProcessingException {
        //把java对象转为json字符串
        Province province = new Province();
        province.setId(1);
        province.setName("河北");
        province.setJiancheng("冀");
        province.setShenhui("石家庄");

        //使用jsckson，把P转为json
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(province);
        System.out.println(s);

    }
}
