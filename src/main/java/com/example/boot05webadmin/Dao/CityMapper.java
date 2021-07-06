package com.example.boot05webadmin.Dao;

import com.example.boot05webadmin.admin.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface CityMapper {
    @Select("select * from city where id=#{id}")
public City getById(Long id);

@Options(useGeneratedKeys = true,keyProperty = "id")
@Insert("insert into city('name','state','country') values (#{name},#{state},#{country})")
public  void insert(City city);
}
