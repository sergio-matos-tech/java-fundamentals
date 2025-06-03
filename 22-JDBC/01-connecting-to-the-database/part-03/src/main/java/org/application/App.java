package org.application;


import org.domain.Producer;
import org.repository.ProducerRepository;

public class App {
    public static void main(String[] args) {

        Producer producer = Producer.Builder
                .builder()
                .name("NHK")
                .build();

        ProducerRepository.save(producer);



    }
}
