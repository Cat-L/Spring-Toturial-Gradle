package com.example.SpringToturialGradle;

import com.example.SringTotutialGradle2.UserOneDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.SringTotutialGradle2")
public class SpringToturialGradleApplication2 {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringToturialGradleApplication2.class, args);

        UserOneDAO userDAO1 = applicationContext.getBean(UserOneDAO.class);
        System.out.println(userDAO1);
//        System.out.println(userDAO1.getJdbcOneConnection());


    }
}
