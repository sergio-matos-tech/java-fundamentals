package org.repository;

import lombok.extern.log4j.Log4j2;
import org.connection.ConnectionFactory;
import org.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


@Log4j2
public class ProducerRepository {

    public static void save(Producer producer) {

        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Database rows affected {}", rowsAffected);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
