package com.example.boot05webadmin.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot05webadmin.Dao.UserAddMapper;
import com.example.boot05webadmin.Dao.UserMapper;
import com.example.boot05webadmin.admin.bean.User;
import com.example.boot05webadmin.admin.service.AdduserService;
import com.example.boot05webadmin.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddUserServiceImpl extends ServiceImpl<UserAddMapper, User> implements AdduserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean addUser(User user){
User userRes =userMapper.selectByUserName(user.getUserName());
if(userRes==null){
    userMapper.insert(user);
}

return true;
    }
}
