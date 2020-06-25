package com.example.SringTotutialGradle2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class UserOneDAO {

    private static Logger logger= LoggerFactory.getLogger(UserOneDAO.class);

    @Autowired
    private JdbcOneConnection jdbcOneConnection;

    public JdbcOneConnection getJdbcOneConnection() {
        return jdbcOneConnection;
    }

    public void setJdbcOneConnection(JdbcOneConnection jdbcOneConnection) {
        this.jdbcOneConnection = jdbcOneConnection;
    }

    @Override
    public String toString() {
        return "UserDao{"+
                "jdbConnect="+jdbcOneConnection+
                "}";
    }

    public void validate(){
        logger.error("ERROR");
    }

}
