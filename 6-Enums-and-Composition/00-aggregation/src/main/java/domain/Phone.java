package domain;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String phoneNumber;
    // Aggregation: Phone has a list of contacts.
    private final List<Contact> contacts;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<>(); // Initialize the list
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}