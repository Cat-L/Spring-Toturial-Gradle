package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="courselist")
@NamedQuery(name = "fetchAllCourse",query = "select s from  CourseList s")
public class CourseList {
  @Id
  int courseid;

  String coursename;

  @Override
  public String toString() {
    return "CourseList{" +
            "courseid=" + courseid +
            ", coursename='" + coursename + '\'' +
            '}';
  }
}
