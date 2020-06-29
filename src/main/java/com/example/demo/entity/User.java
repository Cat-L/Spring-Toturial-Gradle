package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="onlineuser")
public class User {
  public   User(String id,String password){
    this.id=id;
    this.password=password;
  }
  @Id
  private String id;
  private String password;
  private String pname;
  private int gender;
  private String Email;
  private String department;
  private int Admissiondate;
  private int isteacher;
}
