package com.lack.homework.controller;

import com.lack.homework.dao.StudyUserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    StudyUserDaoImpl studyUserDao;

    @GetMapping("/Login")
    public String Login(){
        return "login";
    }

    @RequestMapping("/user/login")
//    public String login(@RequestParam("username")String username,
//                        @RequestParam("password")String password,
//                        HttpSession session,
//                        Model model){
//        StudyUser studyUser = studyUserDao.findByUsername(username);
//        System.out.println(studyUser.toString());
//        if(studyUser!=null&&studyUser.getPassword().equals(password)){
//            session.setAttribute("LoginUser",username);
//            model.addAttribute("LoginUser",username);
//            System.out.println(username);
//            return "dashboard";
//        }else {
//            model.addAttribute("msg","用户名或者密码错误");
//            return "login";
//        }
//
//    }
    public void login(@RequestParam("username")String username, @RequestParam("password")String password){
        
    }
}
