package org.application;

import org.connection.ConnectionFactory;
import org.domain.Producer;
import org.repository.ProducerRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        try (Connection connection = ConnectionFactory.getConnection()) {
            System.out.println("Connection successful!");
            System.out.println(connection);
        } catch (RuntimeException | SQLException e) {
            System.err.println("Failed to connect to the database.");
            System.out.println(e.getMessage());
        }

        Producer producer = Producer.Builder.builder()
                .name("NHK")
                .build();

        ProducerRepository.save(producer);
    }
}