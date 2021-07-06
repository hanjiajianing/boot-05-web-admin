package com.example.boot05webadmin.admin.controller;

import com.example.boot05webadmin.admin.bean.User;
import com.example.boot05webadmin.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

@Controller
public class TableController {
    @Autowired
    UserService userService;
    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table( Model model){
//        List<User> users= Arrays.asList(new User("laoWang","123"),new User("xiaoLi","321"),
//                new User("Dazhang","hahaha"),new User("zhazhahui","9bgsn"));
//      model.addAttribute("users",users);
        List<User> list =userService.list();
        model.addAttribute("users",list);
        //分页查询数据
//        Page<User> userPage =new Page<>(pn,2);
//       Page<User> page= userService.page(userPage,null);
//       model.addAttribute("page",page);
        return "table/dynamic_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/response_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
