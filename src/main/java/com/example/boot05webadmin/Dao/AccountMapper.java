package com.example.boot05webadmin.Dao;
import com.example.boot05webadmin.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
   public Account getAcct(Long id);
}
