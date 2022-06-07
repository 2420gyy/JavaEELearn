package com.atgui.admin.service.impl;

import com.atgui.admin.bean.City;
import com.atgui.admin.mapper.CityMapper;
import com.atgui.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    public City getCityById(Long id) {
        return cityMapper.findById(id);
    }
    public void insertCity(City city){
        cityMapper.insert(city);
    }
}
