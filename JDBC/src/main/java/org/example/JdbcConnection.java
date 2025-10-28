package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    private final static String url = "jdbc:mysql://localhost:3306/school";
    private final static String userName = "root";
    private final static String password = "Parths18@";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);

        }catch (SQLException e){
            e.getMessage();
        }
        return connection;
    }
}