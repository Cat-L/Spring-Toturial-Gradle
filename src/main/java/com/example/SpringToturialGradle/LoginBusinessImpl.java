package com.example.SpringToturialGradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //default: singleton , others: prototype request session
public class LoginBusinessImpl {

    @Qualifier("MobileEnd")
    @Autowired
    LoginApproach loginApproach;
//    class "LoginBusinessImpl" 依赖于 接口"LoginApproach "

//    public LoginBusinessImpl(LoginApproach loginApproach) {
//        this.loginApproach = loginApproach;
//    }

    public void setLoginApproach(LoginApproach loginApproach) {
        this.loginApproach = loginApproach;
    }

    public String LoginBusiness(String username, String password){
        String result="fail";
        result= loginApproach.validate(username, password);
        return result;
    }
}
