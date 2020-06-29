package edu.snnu.css.EndDemo.service.Impl;

import edu.snnu.css.EndDemo.entity.Course;
import edu.snnu.css.EndDemo.service.CourseService;
import edu.snnu.css.EndDemo.springData.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Override
    public List<Course> findAll() {
        return courseRepo.findAll();
    }

    @Override
    public Optional<Course> findById(Integer id) {
        return courseRepo.findById(id);
    }

    @Override
    public Optional findByUserid(Integer userid) {
        return courseRepo.findByUserid(userid);
    }

    @Override
    public Course add(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course update(Course course) {
        return courseRepo.save(course);
    }
}
