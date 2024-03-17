package javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        now = now.plusDays(20);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.withMonth(8);

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(ChronoField.DAY_OF_MONTH, 27);

        System.out.println(now);

    }
}
