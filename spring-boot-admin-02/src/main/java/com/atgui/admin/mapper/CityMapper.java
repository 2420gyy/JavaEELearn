package com.atgui.admin.mapper;

import com.atgui.admin.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CityMapper {

//    设置缓存时间，能够为对象生成自增的key
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into city_test(name, state, country) values(#{name}, #{state}, #{country})")
    void insert(City city);


    @Select("select id,name,state,country from city_test where id = #{id}")
    City findById(long id);

}
