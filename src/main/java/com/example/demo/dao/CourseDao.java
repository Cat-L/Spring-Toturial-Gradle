package com.example.demo.dao;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import com.example.demo.entity.Video;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Repository
@Transactional
public class CourseDao {



  //通过JPA的魔种方式去连接
  @PersistenceContext
  EntityManager entityManager;
  public Video findById(int id){
    return entityManager.find(Video.class,id);
  }

  public Course insert(Course course){
    return entityManager.merge(course);
  }


  //    public void deleteById(String id){
//      User user1=findById(id);
//      entityManager.remove(user1);
//    }
//  public List<Course> findCourseByCourseId(int courseid);
}
