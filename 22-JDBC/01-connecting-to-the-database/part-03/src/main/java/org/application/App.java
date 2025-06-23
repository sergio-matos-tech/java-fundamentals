package org.application;

import lombok.extern.log4j.Log4j2;
import org.connection.ConnectionFactory;
import org.domain.Producer;
import org.service.ProducerService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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


        /* Producer producerToUpdate = Producer
                .builder()
                .id(1)
                .name("MadHouse")
                .build();

        ProducerService.update(producerToUpdate);
        */

        /*

        List<Producer> producers = ProducerService.findAll();
        log.info("Producers found:\n'{}'", producers);
        producers.forEach(System.out::println);

        */

        // ProducerService.showProducerMetaData();
        // ProducerService.showDriverMetaData();
        // ProducerService.showTypeScrollWorking();

        // List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
        // log.info("Producer:\n'{}'", producers);

        // List<Producer> producerList = ProducerService.findByNameAndInsertWhenNotFound("A-1 Pictures");
        // log.info("Producers found: '{}'", producerList);

        List<Producer> producerList = ProducerService.findByNamePreparedStatement("MadHouse");
        for (Producer producer : producerList) {
            System.out.println(producer);
        }

    }
}