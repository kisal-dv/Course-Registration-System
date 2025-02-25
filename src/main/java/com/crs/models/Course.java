package com.crs.models;

public class Course {
    private int id;
    private String courseName;
    private int creditHours;

    public Course(int id, String courseName, int creditHours) {
        this.id = id;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }
}