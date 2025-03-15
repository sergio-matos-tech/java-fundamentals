package model.entities;

import model.domain.Notification;

public class Email implements Notification {
    @Override
    public String sendMessage(String message) {
        return "Email sent successfully: 'Your request was approved!'";
    }
}
