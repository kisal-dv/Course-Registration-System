package com.crs.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private static String URL;
    private static String root;
    private static String 1234;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/application.properties"));

            URL = properties.getProperty("db.url");
            root = properties.getProperty("db.username");
            1234 = properties.getProperty("db.password");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load database configuration!");
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Database connection failed!");
        }
    }
}
