package edu.snnu.css.DAODemo.dao;

import edu.snnu.css.DAODemo.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentJPADao {

//    connect database in the JPA way
    @PersistenceContext
    EntityManager entityManager;

    public Student findById(String id){
        return entityManager.find(Student.class,id);
    }

    public Student insert(Student student){
        return entityManager.merge(student);
    }

    public Student update(Student student){
        return entityManager.merge(student);
    }

    public void deleteById(String id){
        Student student=findById(id);
        entityManager.remove(student);
    }

    public List<Student> fetchAllStudent(){
        TypedQuery<Student> fetch_all_studetns = entityManager.createNamedQuery("fetch_all_Students",Student.class);
        return fetch_all_studetns.getResultList();
    }
}






