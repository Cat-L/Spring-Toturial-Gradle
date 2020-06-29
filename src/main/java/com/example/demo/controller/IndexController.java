package com.example.demo.controller;

import com.example.demo.dao.CourseListDao;
import com.example.demo.dao.FileDao;
import com.example.demo.dao.UserCourseDao;
import com.example.demo.entity.CourseList;
import com.example.demo.entity.UserCourse;
import com.example.demo.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;

@Controller
public class IndexController {

  @Autowired
  FileDao fileDao;
  @Autowired
  CourseListDao courseListDao;
  @Autowired
  UserCourseDao userCourseDao;

  @GetMapping("/Personal")
  public String personal(){
    return "personal";
  }

  @GetMapping("/VideoUploads")
    public String videoUpload(){
    return "videoUploads";
    }

  @GetMapping("/CreateClass")
  public String createClass(Model model){
    Collection<Video> videos=fileDao.fetchAllVideo();
    model.addAttribute("Videos",videos);
    return "createClass";
  }

  @GetMapping("/AllCourse")
  public String AllCourse(Model model){
    Collection<CourseList> courseLists=courseListDao.fetchAllCourse();
    model.addAttribute("Courses",courseLists);
    return "AllCourse";
  }

  @GetMapping("/Learning")
  public String Learning(Model model, HttpSession session){
    List<Integer> courseList=userCourseDao.fetchAllCourseId((String)session.getAttribute("LoginUser"));
    model.addAttribute("Course",courseList);
    return "Learning";
  }
}
