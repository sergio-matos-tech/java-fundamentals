package org.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.domain.Producer;
import org.repository.ProducerRepositoryRowSet;

import java.util.List;

public class App2 {
    private static final Logger log = LogManager.getLogger(App2.class);

    public static void main(String[] args) {


        List<Producer> producerList = ProducerRepositoryRowSet.findByNameJdbcRowSet("NHK");
        log.info(producerList);
    }
}
