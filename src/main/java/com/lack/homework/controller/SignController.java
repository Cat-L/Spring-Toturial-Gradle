package com.lack.homework.controller;

import com.lack.homework.dao.StudyUserDaoImpl;
import com.lack.homework.entity.StudyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignController {

    @Autowired
    StudyUserDaoImpl studyUserDao;

    @GetMapping("/Sign")
    public String Sign(){
        return "sign";
    }

    @RequestMapping("/signCheck")
    public String signCheck(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        @RequestParam("password1")String password1,
                        Model model){
        if(studyUserDao.findByUsername(username)!=null){
            model.addAttribute("msg","账号已经存在");
            return "sign";
        }
        if(!password.equals(password1)){
            model.addAttribute("msg","两次密码不一样");
            return "sign";
        }
        studyUserDao.insert(new StudyUser(username, password));
        return "redirect:/Login";
    }
}
