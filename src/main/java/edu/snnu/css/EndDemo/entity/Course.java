package edu.snnu.css.EndDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@NamedQuery(name = "CourseDao.findCourseByCourseId",query = "select c from  course c where c.courseId=?1")
public class Course {
  @Id
  int courseid;
  int userid;
}
