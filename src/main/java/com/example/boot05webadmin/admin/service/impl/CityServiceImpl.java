package com.example.boot05webadmin.admin.service.impl;

import com.example.boot05webadmin.Dao.CityMapper;
import com.example.boot05webadmin.admin.bean.City;
import com.example.boot05webadmin.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
     @Autowired
CityMapper cityMapper;
    public City getById(Long id){
      return   cityMapper.getById(id);
    }
    public void  saveCity(City city){
        cityMapper.insert(city);
    }
}
