package org.application;


import org.domain.Person;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .id(1)
                .name("Horiel")
                .email("horiel@gmail.com")
                .build();

        System.out.println(person);

    }
}