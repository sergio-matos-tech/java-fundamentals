package factory;

import domain.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactFactory {
    private final List<Contact> contacts = new ArrayList<>();

    public void add(String name, String phone) {
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "ContactFactory{" +
                "contacts=" + contacts +
                '}';
    }
}
