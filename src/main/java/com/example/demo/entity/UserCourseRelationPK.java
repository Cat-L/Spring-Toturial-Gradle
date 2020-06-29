package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

@Data
public class UserCourseRelationPK implements Serializable {
  public String id;

  public int courseid;
}
