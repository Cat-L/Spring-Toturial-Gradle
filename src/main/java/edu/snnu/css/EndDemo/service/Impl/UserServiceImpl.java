package edu.snnu.css.EndDemo.service.Impl;

import edu.snnu.css.EndDemo.entity.User;
import edu.snnu.css.EndDemo.service.UserService;
import edu.snnu.css.EndDemo.springData.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepo.findById(id);
    }

    @Override
    public Optional<User> findByName(String username) {
        return userRepo.findByName(username);
    }

    @Override
    public User update(User user) {
        return userRepo.save(user);
    }

    @Override
    public User add(User user) {
        return userRepo.save(user);
    }
}
