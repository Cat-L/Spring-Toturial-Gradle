package edu.snnu.css.DAODemo.dao;


import edu.snnu.css.DAODemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> findall(){
        jdbcTemplate.execute("use snnu_demo");
        return jdbcTemplate.query("select * from student",new BeanPropertyRowMapper<Student>(Student.class));
    }
}
