package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseOperations {
    public static void setStudent(Connection connection, Student student){
        String insertQuery = "INSERT into student(studentId, firstName, lastName, address) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, student.getStudentId());
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getLastName());
            preparedStatement.setString(4, student.getAddress());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("STUDENT INSERTED SUCCESSFULLY");
            }
        }catch (SQLException e){
            e.getMessage();
        }finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                }catch (SQLException e){
                    e.getMessage();
                }
            }
        }
    }

    public static void getStudent(Connection connection, Student student){
        String getQuery = "select * from student";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(getQuery);
            resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                int studentId = resultSet.getInt("studentId");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String address = resultSet.getString("address");
                System.out.println("ID: " + studentId + " FirstName: "
                        + firstName + " LastName: " + lastName + " Adress: " + address);
            }
        } catch (SQLException e) {
            e.getMessage();
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                }catch (SQLException e){
                    e.getMessage();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                }catch (SQLException e){
                    e.getMessage();
                }
            }
        }
    }
}
