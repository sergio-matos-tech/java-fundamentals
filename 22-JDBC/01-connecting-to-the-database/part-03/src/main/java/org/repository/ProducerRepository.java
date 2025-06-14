package org.repository;

import lombok.extern.log4j.Log4j2;
import org.connection.ConnectionFactory;
import org.domain.Producer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepository {

    public static void save(Producer producer) {

        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Database rows affected {}\nInserted producer: '{}'", rowsAffected, producer.getName());


        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'! ", producer.getName());
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);


        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Database rows affected {}\nDeleted producer with id: '{}'", rowsAffected, id);


        } catch (SQLException e) {
            //noinspection LoggingSimilarMessage
            log.error("Error trying to insert producer with id '{}'! ", id);
            throw new RuntimeException(e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE anime_store.producer SET name='%s' WHERE id='%d';"
                .formatted(producer.getName(), producer.getId());

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(sql);
            log.info("Database rows affected {}\nUpdated producer with id: '{}'", rowsAffected, producer.getId());


        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to insert producer with id '{}'! ", producer.getId());
            }
            throw new RuntimeException(e);
        }
    }


    public static List<Producer> findAll() {
        log.info("Finding all producers");
        String sql = "SELECT id, name FROM anime_store.producer; ";
        List<Producer> producerList = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(name).build();
                producerList.add(producer);
            }



        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find all producers ! ");
            }
            throw new RuntimeException(e);
        }

        return producerList;
    }
}
