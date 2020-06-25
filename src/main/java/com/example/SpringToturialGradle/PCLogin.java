package com.example.SpringToturialGradle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("PCEnd")
public class PCLogin implements LoginApproach{
    public String validate(String username,String password){
      //pc login function
      return "PC LOGIN";
    };
}
