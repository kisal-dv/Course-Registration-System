package com.crs.controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class AdminDashboardController {

    @FXML
    public void openStudentManagement() throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/views/StudentView.fxml"))));
        stage.setTitle("Student Management");
        stage.show();
    }

    @FXML
    public void openCourseManagement() throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/views/CourseView.fxml"))));
        stage.setTitle("Course Management");
        stage.show();
    }
}
