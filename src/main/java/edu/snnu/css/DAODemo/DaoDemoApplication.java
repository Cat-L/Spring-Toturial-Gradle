package edu.snnu.css.DAODemo;

import edu.snnu.css.DAODemo.dao.StudentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaoDemoApplication implements CommandLineRunner {

	@Autowired
	StudentDAO studentDAO;

	private Logger logger =  LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication. run(DaoDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("查询所有学生信息——————>{}",studentDAO.findall());
	}
}
