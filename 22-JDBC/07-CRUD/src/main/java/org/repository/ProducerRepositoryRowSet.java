package org.repository;

import org.connection.ConnectionFactory;
import org.domain.Producer;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE NAME like ?;";
        List<Producer> producers = new ArrayList<>();

        try (JdbcRowSet jdbcRowSet = ConnectionFactory.getJdbcRowSet()) {
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setString(1, name);
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                Producer producer = Producer.builder()
                        .id(jdbcRowSet.getInt("id"))
                        .name(jdbcRowSet.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return producers;
    }
}
