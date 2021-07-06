package com.example.boot05webadmin.admin.service;

import com.example.boot05webadmin.Dao.CityMapper;
import com.example.boot05webadmin.admin.bean.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CityService {

    public City getById(Long id);
    public void  saveCity(City city);
}
