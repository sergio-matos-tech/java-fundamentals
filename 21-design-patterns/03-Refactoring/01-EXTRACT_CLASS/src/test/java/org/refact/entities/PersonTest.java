package org.refact.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetTelephoneNumberAfterExtractingClass() {
        Person person = new Person();
        person.setName("Martin Fowler");

        person.getOfficeTelephone().setOfficeAreaCode("123");
        person.getOfficeTelephone().setOfficeNumber("4567890");

        String expectedPhoneNumber = "(123) 4567890";
        assertEquals(expectedPhoneNumber, person.getTelephoneNumber(),
                "O número de telefone formatado deve estar correto após a extração da classe.");
    }
}