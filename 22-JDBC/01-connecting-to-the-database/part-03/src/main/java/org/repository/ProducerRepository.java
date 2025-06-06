package org.repository;

import org.connection.ConnectionFactory;
import org.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(sql);
            System.out.println(rowsAffected);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
