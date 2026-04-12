package com.hotel.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=HotelDB";
    private static final String USER = "zoper";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
