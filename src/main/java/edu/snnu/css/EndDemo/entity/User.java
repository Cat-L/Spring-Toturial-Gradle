package edu.snnu.css.EndDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="onlineuser")
public class User {
  public   User(String id,String password){
    this.id=id;
    this.password=password;
  }


  @Id
  private String id;
  private String password;
  private String name;
  private int gender;
  private String Email;
  private String department;
  private int Admissiondate;
  private int isteacher;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getAdmissiondate() {
    return Admissiondate;
  }

  public void setAdmissiondate(int admissiondate) {
    Admissiondate = admissiondate;
  }

  public int getIsteacher() {
    return isteacher;
  }

  public void setIsteacher(int isteacher) {
    this.isteacher = isteacher;
  }
}
