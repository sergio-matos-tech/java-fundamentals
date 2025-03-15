package model.entities;

import model.domain.Notification;

public class SMS implements Notification {
    @Override
    public String sendMessage(String message) {
        return "SMS sent successfully. 'Your request was approved!'";
    }
}
