package edu.snnu.css.EndDemo.springData;

import edu.snnu.css.EndDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {

}
