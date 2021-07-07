package com.example.boot05webadmin.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boot05webadmin.admin.bean.User;
import org.springframework.stereotype.Service;

@Service
public interface AdduserService extends IService<User> {
public boolean addUser(User user);
}
