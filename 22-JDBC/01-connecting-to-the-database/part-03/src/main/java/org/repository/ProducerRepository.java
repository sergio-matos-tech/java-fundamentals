package org.repository;

import lombok.extern.log4j.Log4j2;
import org.connection.ConnectionFactory;
import org.domain.Producer;

import java.sql.*;
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
        return findByName("");
    }

    public static List<Producer> findByName(String name) {

        log.info("Finding producer of name '{}'", name);
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

        List<Producer> producerList = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {


            while (rs.next()) {
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(name1).build();
                producerList.add(producer);
            }

        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find the producer '{}' ! ", name);
            }
            throw new RuntimeException(e);
        }

        return producerList;
    }

    public static void showProducerMetaData() {

        log.info("Showing Producer metadata");
        String sql = "SELECT * FROM anime_store.producer";

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("Columns count: '{}'", columnCount);
            for (int i = 1; i <=columnCount ; i++) {
                log.info("Table Name: '{}'", metaData.getTableName(i));
                log.info("Column Name: '{}'", metaData.getColumnName(i));
                log.info("Column Size: '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column Type: '{}'", metaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find the producer ");
            }
            throw new RuntimeException(e);
        }
    }

    public static void showDriverMetaData() {

        log.info("Showing Driver metadata");

        try (Connection connection = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE  ");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports CONCUR_UPDATABLE ");
                }
            }

        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find driver MetaData ");
            }
            throw new RuntimeException(e);
        }
    }

    public static void showTypeScrollWorking() {

        String sql = "SELECT * FROM anime_store.producer; ";

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {

            if (rs.first()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                log.info("First row: '{}' | '{}'", rs.getRow(), producer);
            }


            if (rs.last()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                log.info("Last row: '{}' | '{}'", rs.getRow(), producer);
            }


        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find all producers ");
            }
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {

        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

        List<Producer> producerList = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(name1).build();
                producerList.add(producer);
            }

        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find the producer with name:  '{}' ! ", name);
            }
            throw new RuntimeException(e);
        }

        return producerList;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {

        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

        List<Producer> producerList = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {

            if (rs.next()) return producerList;

            rs.moveToInsertRow();
            rs.updateString("name", name);
            rs.insertRow();
            producerList.add(getProducer(rs));

        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find the producer with name: '{}' ! ", name);
            }
            throw new RuntimeException(e);
        }

        return producerList;
    }

    public static void findByNameAndDelete(String name) {

        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find the producer with name: '{}' ! ", name);
            }
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNamePreparedStatement(String name) {

        log.info("Finding producer by name using PreparedStatement '{}'", name);
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";

        List<Producer> producerList = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(name1).build();
                producerList.add(producer);
            }

        } catch (SQLException e) {
            if (log.isErrorEnabled()) {
                log.error("Error trying to find the producer '{}' ! ", name);
            }
            throw new RuntimeException(e);
        }

        return producerList;
    }

    public static void updatePreparedStatement(Producer producer) {
        log.info(String.format("Updating producer '%s'", producer));
        String sql = "UPDATE anime_store.producer SET name = ? WHERE id = ?;";

        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, producer.getName());
            statement.setInt(2, producer.getId());

            int rowsAffected = statement.executeUpdate();
            log.info(String.format("Updated producer '%d'. Rows affected: %d", producer.getId(), rowsAffected));

        } catch (SQLException e) {
            log.info(String.format("Error trying to update the producer with id '%d'!", producer.getId()));
            throw new RuntimeException(e);
        }
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        return Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
    }


}
