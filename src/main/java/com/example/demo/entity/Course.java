package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="course")
@IdClass(CourseRelationPK.class)
//@NamedQuery(name = "CourseDao.findCourseByCourseId",query = "select c from  course c where c.courseId=?1")
public class Course {
  @Id
  int videoid;
  @Id
  int courseid;
}
