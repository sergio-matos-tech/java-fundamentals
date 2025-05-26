package application;


import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class App {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            int rows1 = statement.executeUpdate("UPDATE seller SET baseSalary = 2090 WHERE DepartmentId = 1");
            int rows2 = statement.executeUpdate("UPDATE seller SET baseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();

            System.out.printf("Rows1 = %d Rows2 = %d", rows1, rows2);


        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new DbException(ex.getMessage());
            }
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }

    }
}
