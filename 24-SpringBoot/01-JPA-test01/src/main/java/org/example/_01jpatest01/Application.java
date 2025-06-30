package org.example._01jpatest01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.example._01jpatest01.domain.Person; // <-- Make sure this import is correct
import org.example._01jpatest01.repositories.PersonRepository; // <-- And this one

import java.util.List;

@SpringBootApplication
// Point to the package where your @Entity classes are (now in a sub-package)
@EntityScan("org.example._01jpatest01.domain")
// Point to the package where your Repository interfaces are
@EnableJpaRepositories("org.example._01jpatest01.repositories")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // This CommandLineRunner is no longer needed for the REST endpoint,
    // but you can keep it for testing data insertion on startup.
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository) {
        return args -> {
            // Create and save a new person
            Person newUser = Person.builder()
                    .name("Jane Doe")
                    .email("jane.doe@example.com")
                    .build();
            repository.save(newUser);
            System.out.println("🎉 Successfully saved a new user!");
        };
    }
}