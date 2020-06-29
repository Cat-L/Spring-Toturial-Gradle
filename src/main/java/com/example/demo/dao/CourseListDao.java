package com.example.demo.dao;

import com.example.demo.entity.CourseList;
import com.example.demo.entity.User;
import com.example.demo.entity.Video;

import org.springframework.data.repository.query.Param;
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
public class CourseListDao {



  //通过JPA的魔种方式去连接
  @PersistenceContext
  EntityManager entityManager;
//  public Video findById(String id){
//    return entityManager.find(Video.class,id);
//  }
//
  public CourseList insert(CourseList courseList){
    return entityManager.merge(courseList);
  }
//
//  public Video update(Video video){
//    return  entityManager.merge(video);
//  }

  //    public void deleteById(String id){
//      User user1=findById(id);
//      entityManager.remove(user1);
//    }
  public List<CourseList> fetchAllCourse(){
    TypedQuery<CourseList> fetch_all_students = entityManager.createNamedQuery("fetchAllCourse", CourseList.class);
    return fetch_all_students.getResultList();
  }

  public List<BigInteger> getnum( ){
    Query query =  entityManager.createNativeQuery("select count(courseid) from CourseList");
    return query.getResultList();
  }
}
