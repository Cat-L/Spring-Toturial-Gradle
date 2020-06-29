package edu.snnu.css.EndDemo.springData;

import edu.snnu.css.EndDemo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepo extends JpaRepository<Course,Integer> {
    Optional<Course> findByUserid(Integer userid);
}
