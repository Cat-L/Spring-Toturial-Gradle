package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.entity.Video;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class UserDao {



    //通过JPA的魔种方式去连接
    @PersistenceContext
    EntityManager entityManager;
    public User findById(String id){
      return entityManager.find(User.class,id);
    }

    public User insert(User user){
      return entityManager.merge(user);
    }

    public User update(User user){
      return  entityManager.merge(user);
    }

//    public void deleteById(String id){
//      User user1=findById(id);
//      entityManager.remove(user1);
//    }

}
