package edu.snnu.css.EndDemo.service;

import edu.snnu.css.EndDemo.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> findAll();

    Optional<Course> findById(Integer id);

    Optional findByUserid(Integer userid);

    Course add(Course course);

    Course update(Course course);
}
