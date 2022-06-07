package com.atgui.admin.service;

import com.atgui.admin.bean.City;

public interface CityService {

    public City getCityById(Long id);

    public void insertCity(City city);
}
