package javacore.Rdate.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));

        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());

        System.out.println(now.getDayOfWeek());
    }
}
