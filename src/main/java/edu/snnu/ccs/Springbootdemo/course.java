package edu.snnu.ccs.Springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class course {
    private String cousreid;
    private String courseName;
    private String courseAuthor;

    public String getCousreid() {
        return cousreid;
    }

    public void setCousreid(String cousreid) {
        this.cousreid = cousreid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }
    public course(){

    }
    public course(String cousreid, String courseName, String courseAuthor) {
        this.cousreid = cousreid;
        this.courseName = courseName;
        this.courseAuthor = courseAuthor;
    }

    @Override
    public String toString() {
        return "course{" +
                "cousreid='" + cousreid + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseAuthor='" + courseAuthor + '\'' +
                '}';
    }
}
