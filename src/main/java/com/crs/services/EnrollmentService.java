package com.crs.services;

import com.crs.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnrollmentService {
    public void enrollStudent(int studentId, int courseId) {
        String query = "INSERT INTO enrollments (student_id, course_id) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            stmt.setInt(2, courseId);
            stmt.executeUpdate();
            System.out.println("Student enrolled successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
