package com.crs.services;

import com.crs.utils.DatabaseConnection;
import java.sql.*;

public class StudentService {
    public void addStudent(String name, String program) {
        String query = "INSERT INTO students (name, program) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, program);
            stmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}