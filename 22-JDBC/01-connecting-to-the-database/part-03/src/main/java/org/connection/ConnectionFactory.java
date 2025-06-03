package org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // java.sql -> Connection, Statement, ResultSet, DriverManager

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "kakaroto";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
