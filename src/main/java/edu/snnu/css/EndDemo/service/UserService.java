package edu.snnu.css.EndDemo.service;

import edu.snnu.css.EndDemo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService{
    List<User> findAll();
    
    Optional<User> findById(Integer id);
    
    Optional<User> findByName(String username);
    
    User update(User user);

    User add(User user);
}
