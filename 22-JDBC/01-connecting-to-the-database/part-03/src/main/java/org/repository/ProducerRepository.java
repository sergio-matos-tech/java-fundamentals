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
            log.info("Database rows affected {}\nInserted producer: {}", rowsAffected, producer.getName());


        } catch (SQLException e) {
            log.error("Error while trying to insert producer {}! ", producer.getName());
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);


        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Database rows affected {}\nDeleted producer with id: {}", rowsAffected, id);


        } catch (SQLException e) {
            log.error("Error trying to insert producer with id {}! ", id);
            throw new RuntimeException(e);
        }
    }
}
