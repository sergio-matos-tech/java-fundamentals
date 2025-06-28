package org.example;

import domain.Contact;
import domain.Phone;

public class App {
    public static void main(String[] args) {
        Phone myPhone = new Phone("4002-8922");

        Contact contact1 = new Contact("Alice", "555-5678");
        Contact contact2 = new Contact("Bob", "555-8765");
        Contact contact3 = new Contact("Charlie", "555-9999");

        myPhone.addContact(contact1);
        myPhone.addContact(contact2);
        myPhone.addContact(contact3);

        System.out.println(myPhone);

        System.out.println("\nIndependent contact object:");
        System.out.println(contact1);
    }
}