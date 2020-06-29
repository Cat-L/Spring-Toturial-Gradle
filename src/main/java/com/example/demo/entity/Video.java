package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Video")
@NamedQuery(name = "fetch_all_Files",query = "select s from  Video s")
public class Video {
  private String name;
  @Id
  private int id;
  public Video(String name){
    this.name=name;
    id=num++;
  }
  static public int num=1;
}
