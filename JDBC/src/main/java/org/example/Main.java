package org.example;

import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection connection = JdbcConnection.getConnection();

        Student student1 = new Student(12, "Parth", "Saini", "Noida");
        Student student2 = new Student(11, "Kabir", "Aneja", "Delhi");
        Student student3 = new Student(10, "Payal", "Bisht", "Delhi");

        DatabaseOperations.setStudent(connection, student3);
        DatabaseOperations.getStudent(connection, student1);
        closeConnection(connection);
    }

    public static void closeConnection(Connection connection){
        if (connection != null){
            try {
                connection.close();
                System.out.println("DATABASE CONNECTION CLOSED");
            }catch (SQLException e){
                e.getMessage();
            }
        }
    }
}