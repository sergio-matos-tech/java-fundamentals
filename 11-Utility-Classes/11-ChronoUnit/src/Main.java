import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1997, Month.APRIL, 1);
        LocalDate nowLocalDate = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(dataNascimento, nowLocalDate));
        System.out.println(ChronoUnit.MONTHS.between(dataNascimento, nowLocalDate));
        System.out.println(ChronoUnit.YEARS.between(dataNascimento, nowLocalDate));
    }
}