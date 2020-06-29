package edu.snnu.css.EndDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="video")
@NamedQuery(name = "fetch_all_Files",query = "select s from  Video s")
public class Video {

  private String filename;
  @Id
  private int id;

  public Video(String filename){
    this.filename=filename;
    id=num++;
  }
  static public int num=1;
}
