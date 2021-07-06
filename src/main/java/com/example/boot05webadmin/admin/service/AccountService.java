package com.example.boot05webadmin.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boot05webadmin.Dao.AccountMapper;
import com.example.boot05webadmin.admin.bean.Account;
import com.example.boot05webadmin.admin.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

 public Account getAcctByid(Long id);
}
