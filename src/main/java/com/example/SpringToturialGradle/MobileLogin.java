package com.example.SpringToturialGradle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MobileEnd")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MobileLogin implements LoginApproach{
        public String validate(String username,String password){
      //mobile login function
      return "Mobile LOGIN";
    };
}
