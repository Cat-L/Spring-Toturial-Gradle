package com.lack.homework.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "study_user")
@NamedQuery(name="fetch_all_StudyUsers",query = "select s from StudyUser s")
public class StudyUser {
    @Id
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String department;
    private Integer stu_id;
    private Integer gender; //0女1男
    private String grade;
    private String major;

    public StudyUser(String username,String password){
        this.username=username;
        this.password=password;
    }
}
