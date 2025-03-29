import java.time.Clock;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        Clock c = Clock.systemUTC();
        System.out.println(c.instant());

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getEra());
        System.out.println(date.isLeapYear());
        System.out.println(date);
    }
}