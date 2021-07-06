package com.example.boot05webadmin.admin.service.impl;

import com.example.boot05webadmin.Dao.AccountMapper;
import com.example.boot05webadmin.admin.bean.Account;
import com.example.boot05webadmin.admin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
@Autowired
AccountMapper accountMapper;
 public Account getAcctByid(Long id){
     return accountMapper.getAcct(id);
 }
}
