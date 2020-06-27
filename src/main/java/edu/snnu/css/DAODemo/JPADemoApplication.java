package edu.snnu.css.DAODemo;

import edu.snnu.css.DAODemo.dao.StudentDAO;
import edu.snnu.css.DAODemo.dao.StudentJPADao;
import edu.snnu.css.DAODemo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class JPADemoApplication implements CommandLineRunner {

	@Autowired
    StudentJPADao studentJPADao;

	private Logger logger =  LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication. run(JPADemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("查询学生信息ByID——————>{}",studentJPADao.findById("41712146"));
//		logger.info("插入——————>{}",studentJPADao.insert(new Student("41712158","lialaia","nananing", new Date( ))));
//		studentJPADao.deleteById("41712158");
//		logger.info("更改——————>{}",studentJPADao.update(new Student("41712152","fasfasf","nananing", new Date( ))));
		logger.info("查询所有学生信息————————>{}",studentJPADao.fetchAllStudent());
	}
}
