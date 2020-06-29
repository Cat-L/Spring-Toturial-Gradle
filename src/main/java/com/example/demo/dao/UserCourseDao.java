package com.example.demo.dao;

import com.example.demo.entity.UserCourse;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

@Repository
@Transactional
public class UserCourseDao {



  //通过JPA的魔种方式去连接
  @PersistenceContext
  EntityManager entityManager;
  //  public Video findById(String id){
//    return entityManager.find(Video.class,id);
//  }
//
  public UserCourse insert(UserCourse userCourse){
    return entityManager.merge(userCourse);
  }
//
//  public Video update(Video video){
//    return  entityManager.merge(video);
//  }

  //    public void deleteById(String id){
//      User user1=findById(id);
//      entityManager.remove(user1);
//    }
  public List<Integer> fetchAllCourseId(String i){
    Query query =  entityManager.createNativeQuery("select courseid from UserCourse where id=?1");
    query.setParameter(1,i);
    return query.getResultList();
  }
  public List<String> fetchAllCourseName(String i){
    Query query =  entityManager.createNativeQuery("select coursename from UserCourse where id=?1");
    query.setParameter(1,i);
    return query.getResultList();
  }

}