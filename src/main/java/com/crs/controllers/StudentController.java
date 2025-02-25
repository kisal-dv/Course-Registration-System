package com.crs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.crs.services.StudentService;

public class StudentController {
    private final StudentService studentService = new StudentService();

    @FXML
    private TextField studentNameField;

    @FXML
    private TextField programField;

    @FXML
    public void addStudent() {
        String name = studentNameField.getText();
        String program = programField.getText();
        studentService.addStudent(name, program);
    }
}
