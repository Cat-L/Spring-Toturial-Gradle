package com.example.SringTotutialGradle;

import org.springframework.stereotype.Component;

//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode= ScopedProxyMode.TARGET_CLASS)
@Component
public class JdbcOneConnection {
    public JdbcOneConnection(){
        System.out.println("JDBC Status:Work");
    }

}
