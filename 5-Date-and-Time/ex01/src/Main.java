import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instantDateTime = Instant.now();

        LocalDate localDate1 = LocalDate.parse("2024-08-25");
        LocalDateTime localDateTime1 = LocalDateTime.parse("2022-08-25T01:30:26");
        Instant instantDateTime1 = Instant.parse("2024-08-25T01:30:26Z");
        Instant instantDateTime2 = Instant.parse("2024-08-25T01:30:26-03:00");

        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(instantDateTime);
        System.out.println(localDate1);
        System.out.println(localDateTime1);
        System.out.println(instantDateTime1);
        System.out.println(instantDateTime2);
    }
}
