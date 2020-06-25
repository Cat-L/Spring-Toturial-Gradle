package com.example.SringTotutialGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringToturialGradleApplication2 {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringToturialGradleApplication2.class, args);

        UserOneDAO userDAO1 = applicationContext.getBean(UserOneDAO.class);
        System.out.println(userDAO1);
        System.out.println(userDAO1.getJdbcOneConnection());


    }
}
