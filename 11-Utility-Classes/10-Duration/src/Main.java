import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime twoYearsAgo = LocalDateTime.now().minusYears(2);

        Duration duration = Duration.between(twoYearsAgo, now);
        System.out.println(duration.toDays());
        System.out.println(duration.toDays() / 360);

        LocalDate dateNow = LocalDate.now();
        LocalDate twoYearAgoDate = LocalDate.now().minusYears(2).minusMonths(3);
        Period period = Period.between(twoYearAgoDate, dateNow);
        System.out.println(period);
    }
}