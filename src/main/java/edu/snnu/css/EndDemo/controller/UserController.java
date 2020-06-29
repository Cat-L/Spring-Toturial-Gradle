package edu.snnu.css.EndDemo.controller;

import edu.snnu.css.EndDemo.entity.User;
import edu.snnu.css.EndDemo.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
//    UserRepo userService;
    UserServiceImpl userService;

//    @GetMapping("/user/")
//    public Map getAllUserInJson(){
//        return (Map) userService.findAll();
//    }

    @GetMapping("/user/{username}")
    public Map getUserInJson(@RequestParam String username, @RequestParam String password) {
        User user = userService.findByName(username).orElseGet(()->new User(username,password));
        if (username != null && user.getPassword().equals(password)) {
            System.out.println(username);
            return (Map) user;
        } else {
            System.out.println(username);
            return null;
        }
    }

    @PutMapping("/user/")
//    更新信息与创建用户
    public Map postUserInJson(@RequestParam String username, @RequestParam String password) {
        User user = userService.findByName(username).orElseGet(()->new User(username,password));
        if (username != null) {
            if(user.getPassword().equals(password)){
                return null;
                //                    用户已存在
            }
            else {
                System.out.println("password error");
                return null;
            }
        } else {
            user = userService.add(new User(username, password));
            return (Map) user;
        }
    }


}
