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
public class FileDao {



  //通过JPA的魔种方式去连接
  @PersistenceContext
  EntityManager entityManager;
  public Video findById(String id){
    return entityManager.find(Video.class,id);
  }

  public Video insert(String name){
    return entityManager.merge(new Video(name));
  }

  public Video update(Video video){
    return  entityManager.merge(video);
  }

//    public void deleteById(String id){
//      User user1=findById(id);
//      entityManager.remove(user1);
//    }
  public List<Video> fetchAllVideo(){
    TypedQuery<Video> fetch_all_students = entityManager.createNamedQuery("fetch_all_Files", Video.class);
    return fetch_all_students.getResultList();

  }
}
