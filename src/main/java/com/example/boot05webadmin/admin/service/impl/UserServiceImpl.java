package com.example.boot05webadmin.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot05webadmin.Dao.UserMapper;
import com.example.boot05webadmin.admin.bean.User;
import com.example.boot05webadmin.admin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
