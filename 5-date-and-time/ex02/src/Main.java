import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDateTime horarioUberlandia = LocalDateTime.now(ZoneId.systemDefault());
        LocalDate dataUberlandia = LocalDate.now(ZoneId.systemDefault());

        LocalDate pastWeekLocalDate = dataUberlandia.minusWeeks(2);
        LocalDate nextWeekLocalDate = dataUberlandia.plusWeeks(2);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);


        System.out.println(dataUberlandia.getDayOfMonth());
        System.out.println(dataUberlandia.getDayOfWeek());
        System.out.println(horarioUberlandia.getHour());

        System.out.println(horarioUberlandia.getMinute());
        System.out.println(horarioUberlandia);
        System.out.println(dataUberlandia);

    }
}
