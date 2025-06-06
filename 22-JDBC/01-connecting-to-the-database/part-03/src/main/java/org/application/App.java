package org.application;


import org.connection.ConnectionFactory;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {

        Connection connection = ConnectionFactory.getConnection();

        System.out.println(connection);

    }
}
