package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Id;

@Data
@Entity
@Table(name="usercourse")
@IdClass(UserCourseRelationPK.class)
@NoArgsConstructor
@AllArgsConstructor
public class UserCourse {
  @Id
  public String id;
  @Id
  public int courseid;
  public  String coursename;
}
