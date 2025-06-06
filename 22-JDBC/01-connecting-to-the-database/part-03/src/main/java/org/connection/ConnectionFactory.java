package org.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // java.sql -> Connection, Statement, ResultSet, DriverManager

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3308/anime_store";
        String username = "root";
        String password = "secret";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL driver not found", e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
