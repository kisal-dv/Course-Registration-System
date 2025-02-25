package com.crs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.crs.services.CourseService;

public class CourseController {
    private final CourseService courseService = new CourseService();

    @FXML
    private TextField courseNameField;

    @FXML
    private TextField creditHoursField;

    @FXML
    public void addCourse() {
        try {
            String courseName = courseNameField.getText();
            int creditHours = Integer.parseInt(creditHoursField.getText());
            courseService.addCourse(courseName, creditHours);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid credit hours.");
        }
    }
}
