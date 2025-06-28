package service;

import domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();

        Assertions.assertFalse(personService.isAdult(person));
    }

    @Test
    @DisplayName("A person should be an adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualThan18() {
        Person person = new Person(18);
        PersonService personService = new PersonService();

        Assertions.assertTrue(personService.isAdult(person));
    }
}