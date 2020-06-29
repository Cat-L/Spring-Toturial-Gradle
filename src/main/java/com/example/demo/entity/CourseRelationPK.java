package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseRelationPK implements Serializable {

  private int videoid;

  private int courseid;
}