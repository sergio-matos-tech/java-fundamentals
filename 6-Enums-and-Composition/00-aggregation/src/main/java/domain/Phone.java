package domain;

import factory.ContactFactory;

public class Phone {
    private String phoneNumber;
    private final ContactFactory contacts = new ContactFactory();

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
