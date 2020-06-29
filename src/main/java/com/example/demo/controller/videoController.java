package com.example.demo.controller;

import com.example.demo.dao.CourseDao;
import com.example.demo.dao.CourseListDao;
import com.example.demo.dao.FileDao;
import com.example.demo.dao.UserCourseDao;
import com.example.demo.entity.*;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;


@Controller
public class videoController {
  private static final Logger LOGGER = LoggerFactory.getLogger(videoController.class);

  @Autowired
  FileDao fileDao;
  @Autowired
  CourseDao courseDao;
  @Autowired
  CourseListDao courseListDao;
  @Autowired
  UserCourseDao userCourseDao;
  @GetMapping("/upload")
  public String upload() {
    return "videoUploads";
  }

  @PostMapping("/upload")

  public String upload(@RequestParam("file") MultipartFile file, Model model) {
    if (file.isEmpty()) {
      model.addAttribute("msg","上传失败");
      return "videoUploads";
    }
    LOGGER.error("------------------------------>"+file.getSize());
    if(file.getSize()>104857600){
      model.addAttribute("msg","文件不能大于100MB");
      return "videoUploads";
    }
    String fileName = file.getOriginalFilename();
    String filePath = "C:\\Xu\\spring\\onlineClass\\video\\";

    File dest = new File(filePath + fileName);


    try {
      file.transferTo(dest);
      model.addAttribute("msg","上传成功");
      fileDao.insert(fileName);
      return "videoUploads";
    } catch (IOException e) {
      LOGGER.error(e.toString(), e);
    }
    model.addAttribute("msg","上传失败");
    return "videoUploads";
  }

  @PostMapping("toCreate")

  public String toCreate(Lists lists,Model model){
    Collection<Video> videos=fileDao.fetchAllVideo();
    model.addAttribute("Videos",videos);
    System.out.println(lists);
    List<Integer> ls=lists.getSt();
    String s=courseListDao.getnum().get(0).toString();
    int num=Integer.valueOf(s);
    courseListDao.insert(new CourseList(num+1,lists.getId()));
    for(int i=0;i<lists.getSt().size();i++){
      Course course=new Course();
      course.setVideoid(ls.get(i));
      course.setCourseid(num+1);
      System.out.println(ls.get(i)+" "+num);
      courseDao.insert(course);
    }
    return "createClass";

  }

  @GetMapping("/toAdd/{courseid}")
  public String toAdd(Id id,Model model, HttpSession session,@PathVariable("courseid") Integer courseid){
    String username= (String) session.getAttribute("LoginUser");
    userCourseDao.insert(new UserCourse(username,courseid,courseDao.findById(courseid).getName()));
    Collection<CourseList> courseLists=courseListDao.fetchAllCourse();
    model.addAttribute("Courses",courseLists);
    return "AllCourse";
  }



}
