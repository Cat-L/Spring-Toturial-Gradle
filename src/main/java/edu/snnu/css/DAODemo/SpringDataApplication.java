package edu.snnu.css.DAODemo;

import edu.snnu.css.DAODemo.dao.StudentDAO;
import edu.snnu.css.DAODemo.dao.StudentJPADao;
import edu.snnu.css.DAODemo.entity.Student;
import edu.snnu.css.DAODemo.springData.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	@Autowired
    StudentRepo studentRepo;

	private Logger logger =  LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication. run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("查询学生信息ByID——————>{}",studentRepo.findById("41712146"));
//		logger.info("插入——————>{}",studentRepo.save(new Student("41712158","lialaia","nananing", new Date( ))));
//		studentJPADao.deleteById("41712158");
//		logger.info("更改——————>{}",studentRepo.save(new Student("41712152","fasfasf","nananing", new Date( ))));
		logger.info("查询所有学生信息————————>{}",studentRepo.findAll());
	}
}
