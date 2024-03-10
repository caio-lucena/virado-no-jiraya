package javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnityTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.now().plusYears(2);
        LocalDateTime aniversario = LocalDateTime.of(1990, Month.APRIL, 13, 0, 0);

        System.out.println(ChronoUnit.DAYS.between(localDateTime1, localDateTime2));

        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
    }
}
