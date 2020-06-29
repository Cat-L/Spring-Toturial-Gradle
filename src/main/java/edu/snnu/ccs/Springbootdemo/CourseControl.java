package edu.snnu.ccs.Springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseControl {
    @GetMapping("/course")
    public List<course> GetAllCourse(){
        return Arrays.asList(new course("41712146","lsn","45"));
    }
}
