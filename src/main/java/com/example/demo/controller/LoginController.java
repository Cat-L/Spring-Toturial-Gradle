package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
  @Autowired
  UserDao userDao;
  @GetMapping("/Login")
  public String Login(){
    return "login";
  }

  @PostMapping("/user/login")
  public String login(@RequestParam("username")String username,
                      @RequestParam("password")String password,
                      HttpSession session,
                      Model model){
    User user=userDao.findById(username);
    if(user!=null&&user.getPassword().equals(password)){
      session.setAttribute("LoginUser",username);
      model.addAttribute("LoginUser",username);
      System.out.println(username);
      return "dashboard";
    }
    else{
      model.addAttribute("msg","用户名或者密码错误");
      System.out.println("asdada");
      return "login";
    }

  }



}
