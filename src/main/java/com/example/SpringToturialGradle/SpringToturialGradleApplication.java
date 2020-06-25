package com.example.SpringToturialGradle;

import com.example.SringTotutialGradle2.UserOneDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringToturialGradleApplication {

	private static Logger logger= LoggerFactory.getLogger(SpringToturialGradleApplication.class);

	public static void main(String[] args) {
//		LoginBusinessImpl loginBusiness=new LoginBusinessImpl(new MobileLogin());
//		String result = loginBusiness.LoginBusiness("admin","adminpass");
//		System.out.print(result);

		ApplicationContext applicationContext = SpringApplication.run(SpringToturialGradleApplication.class, args);

//		LoginBusinessImpl loginBusiness1 = applicationContext.getBean(LoginBusinessImpl.class);
//		System.out.println(loginBusiness1);
//
//		LoginBusinessImpl loginBusiness2 = applicationContext.getBean(LoginBusinessImpl.class);
//		System.out.println(loginBusiness2);
//
//
//		String result = loginBusiness1.LoginBusiness("admin","adminpass");
//		System.out.println(result);
	    UserOneDAO userDAO1=applicationContext.getBean(UserOneDAO.class);
//		System.out.println(userDAO1);
		logger.info(userDAO1.toString());
//		System.out.println(userDAO1.getJdbcOneConnection());
//		logger.info(userDAO1.getJdbcOneConnection().toString());
		userDAO1.validate();


		UserOneDAO userDAO2=applicationContext.getBean(UserOneDAO.class);
//		System.out.println(userDAO2);
//		System.out.println(userDAO2.getJdbcOneConnection());
		logger.info(userDAO2.toString());
//		logger.info(userDAO2.getJdbcOneConnection().toString());

		userDAO2.validate();
	}

}
