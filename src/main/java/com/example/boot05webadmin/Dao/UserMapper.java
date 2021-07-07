package com.example.boot05webadmin.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boot05webadmin.admin.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//public User selectByUserName(String userName);
}
