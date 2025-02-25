package com.crs.services;

import com.crs.utils.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public void addCourse(String courseName, int creditHours) {
        String query = "INSERT INTO courses (course_name, credit_hours) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, courseName);
            stmt.setInt(2, creditHours);
            stmt.executeUpdate();
            System.out.println("Course added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}