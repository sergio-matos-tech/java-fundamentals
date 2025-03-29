import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        LocalTime localTime = LocalTime.now();


        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localTime);
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();
        System.out.println("Enter your birth month (1-12): ");
        int birthMonth = input.nextInt();
        System.out.println("Enter your birth day: ");
        int birthDay = input.nextInt();
        input.nextLine();

        LocalDate dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate dateNow = LocalDate.now();
        Period age = Period.between(dateOfBirth, dateNow);

        LocalDateTime birthDateTime = dateOfBirth.atStartOfDay();
        LocalDateTime currentDateTime = LocalDateTime.now();
        long seconds = Duration.between(birthDateTime, currentDateTime).getSeconds();


        System.out.printf("You are %d years, %d months, %d days and %d seconds old", age.getYears(), age.getMonths(),
                age.getDays(), seconds);

        input.close();
    }
}