import java.time.Instant;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(instant);
        System.out.println(localDateTime);
    }
}