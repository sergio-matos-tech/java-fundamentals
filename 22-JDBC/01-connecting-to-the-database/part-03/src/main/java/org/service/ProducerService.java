package org.service;

import org.domain.Producer;
import org.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        validateId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        validateId(producer.getId());
        ProducerRepository.update(producer);

    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    private static void validateId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid id");
        }
    }
}
