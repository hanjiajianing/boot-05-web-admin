package com.example.boot05webadmin.admin.controller;

import com.example.boot05webadmin.admin.bean.Account;
import com.example.boot05webadmin.admin.bean.City;
import com.example.boot05webadmin.admin.bean.User;
import com.example.boot05webadmin.admin.service.AccountService;
import com.example.boot05webadmin.admin.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Slf4j
@Controller
public class IndeController {
    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;


    @ResponseBody
    @GetMapping("/acct")
    public Account getAccountById(@RequestParam Long id){

return accountService.getAcctByid(id);
    }
    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
return  cityService.getById(id);
    }
    @PostMapping("/city")
    public  City saveCity(City city){
        cityService.saveCity(city);
        return city;
    }
    @GetMapping(value = {"/","/login"})
    public String loginPage(Model model, HttpServletRequest request){
       HttpSession session =request.getSession();
       String str=(String) session.getAttribute("msg");
       log.info(str);
        return  "login";
    }
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
  if(StringUtils.hasLength(user.getUserName())&&StringUtils.hasLength(user.getPassword())   ){
      session.setAttribute("loginUser",user);

      return "redirect:/main.html";//主要是防止页面刷新导致的表单重复提交 重定向到mian.html后刷新只是在/main.html下刷新，不会重复提交表单
  }else{model.addAttribute("msg","账号密码错误!!!");
return "login";
  }
    }
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
        User user=(User) session.getAttribute("loginUser");
        if(user!=null){
            return "main";

        }else {
            model.addAttribute("msg","请重新登录吧！！！");
            return  "login";
        }

    }
}
