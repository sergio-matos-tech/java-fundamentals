package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String path = "/home/alfaneto/Documents/Java-Completo/13-Collections/06.2-Sets/reg-log.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> setUserLogs = new HashSet<>();
            String line = reader.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String userName = fields[0];
                Instant moment = Instant.parse(fields[1]);

                setUserLogs.add(new LogEntry(userName, moment));
                line = reader.readLine();
            }

            System.out.println("Total user: " + setUserLogs.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}