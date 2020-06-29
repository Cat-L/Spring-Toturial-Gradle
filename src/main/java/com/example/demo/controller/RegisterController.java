package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

  @Autowired
  UserDao userDao;
  @GetMapping("/Register")
  public String Register(){
    return "register";
  }

  @RequestMapping("/RegisterCheck")
  public  String RegisterCheck(@RequestParam("username")String username,
                               @RequestParam("password")String password,
                               @RequestParam("password1")String password1,
                               Model model){
     if(userDao.findById(username)!=null){
       model.addAttribute("msg","账号已经存在");
       return "register";
     }
     if(!password.equals(password1)){
       System.out.println("两次密码不一样");
       model.addAttribute("msg","两次密码不一样");
       return "register";
     }

     userDao.insert(new User(username,password));
     return "redirect:/Login";
  }
}
