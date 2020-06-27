package edu.snnu.css.DAODemo.springData;

import edu.snnu.css.DAODemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {

}
