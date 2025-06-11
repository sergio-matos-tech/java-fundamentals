package org.application;

import lombok.extern.log4j.Log4j2;
import org.connection.ConnectionFactory;
import org.domain.Producer;
import org.service.ProducerService;

import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
public class App {
    public static void main(String[] args) {

        try (Connection connection = ConnectionFactory.getConnection()) {
            System.out.println("Connection successful!");
            System.out.println(connection);
        } catch (RuntimeException | SQLException e) {
            System.err.println("Failed to connect to the database.");
            System.out.println(e.getMessage());
        }


        /*

        Producer producer = Producer.builder()
                .name("Karleto")
                .build();
        ProducerService.save(producer);

        ProducerService.delete(14);

        */

    }
}