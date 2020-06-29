package edu.snnu.css.EndDemo.controller;

import edu.snnu.css.EndDemo.entity.Course;
import edu.snnu.css.EndDemo.service.Impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/course/")
    public Map getAllCourseInJson(){
        return (Map) courseService.findAll();
    }

    @GetMapping("/course/{id}")
    public Optional<Course> getCourseInJson(@RequestParam Integer id){
        return courseService.findById(id);
    }

//    @GetMapping("/course/")
//    public Optional getCourseByUserid(@RequestParam Integer userid){
//        return courseService.findByUserid(userid);
//    }

    @PutMapping("/course/")
    public Course putCourseInJson(Course course){
        return courseService.add(course);
    }

    @PostMapping("/course/")
    public Course updateCourseInJson(Course course){
        return courseService.update(course);
    }

}
