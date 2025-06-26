package org.connection;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
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

    public static JdbcRowSet getJdbcRowSet() throws SQLException {

        String url = "jdbc:mysql://localhost:3308/anime_store";
        String username = "root";
        String password = "secret";

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }
}
