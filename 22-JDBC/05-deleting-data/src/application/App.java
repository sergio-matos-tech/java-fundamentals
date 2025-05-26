package application;


import db.DB;
import db.DBIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ? ");

            preparedStatement.setInt(1, 4);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.printf("Done! %d rows affected", rowsAffected);
        } catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }

    }
}
