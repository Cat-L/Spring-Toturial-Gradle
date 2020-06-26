package edu.snnu.css.DAODemo.dao;


import edu.snnu.css.DAODemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class StudentDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> findAll(){
    jdbcTemplate.execute("use snnu_demo");
        return jdbcTemplate.query("select * from student",new BeanPropertyRowMapper<Student>(Student.class));
    }

//    query data base on ID
    public Student findById(String id){
        jdbcTemplate.execute("use snnu_demo");
        return jdbcTemplate.queryForObject("select * from student where id =? ",new Object[]{id} ,new BeanPropertyRowMapper<Student>(Student.class));
    }

    public int deleteById(String id){
        jdbcTemplate.execute("use snnu_demo");
        return jdbcTemplate.update("delete from student where id =? ",new Object[]{id} );
    }

    public int insert(Student student){
        jdbcTemplate.execute("use snnu_demo");
        return jdbcTemplate.update("INSERT INTO student (id,name,location,birth_date) VALUES (?,?,?,?)",
                student.getId(),
                student.getName(),
                student.getLocation(),
                new Timestamp(student.getBirthDate().getTime()));
    }

        public int updateById(Student student){
        jdbcTemplate.execute("use snnu_demo");
        return jdbcTemplate.update("update student SET name=?,location=?,birth_date=? ",
                student.getId(),
                student.getName(),
                student.getLocation(),
                new Timestamp(student.getBirthDate().getTime()));
    }

}
