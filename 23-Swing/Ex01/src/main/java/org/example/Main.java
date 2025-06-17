package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        JButton buttonLogin = new JButton("Enter");
        JLabel labelUser = new JLabel("User: ");
        JTextField userText = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JLabel labelPassword = new JLabel("Password: ");

        passwordField.setBounds(50, 180, 150, 25);
        labelUser.setBounds(50, 50, 100, 25);
        buttonLogin.setBounds(50, 230, 150, 20);
        window.setBounds(0, 0, 400, 500);
        userText.setBounds(50, 80, 150, 25);
        labelPassword.setBounds(50, 150, 100, 25);

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Login: ");
            }
        });


        window.add(buttonLogin);
        window.setLayout(null);
        window.add(labelUser);
        window.add(userText);
        window.add(passwordField);
        window.add(labelPassword);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);


    }
}