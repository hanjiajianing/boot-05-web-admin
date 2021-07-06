package com.example.boot05webadmin;

import com.example.boot05webadmin.Dao.UserMapper;
import com.example.boot05webadmin.admin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
   @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
//     Long along= jdbcTemplate.queryForObject("select count(*) from student",Long.class);
//    log.info("结果：",along);
//    log.info(along.toString());

    }
    //@Test
    void testUserMapper(){
     //  User user =userMapper.selectByUserName("韩");
//       log.info("user:",user);
   //    log.info("user",user);
     //  log.info(String.valueOf(user));
    }

}
