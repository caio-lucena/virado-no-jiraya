package javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate localDate1 = LocalDate.of(1990, 4, 13);
        LocalDate localDate2 = LocalDate.now();
        LocalDate localDate3 = LocalDate.of(1990, Month.APRIL, 13);

        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate2.getDayOfMonth());
        System.out.println(localDate2.getMonth());
        System.out.println(localDate2.lengthOfMonth());
        System.out.println(localDate2.isLeapYear());

        System.out.println(localDate3.isLeapYear());
        System.out.println(localDate3.get(ChronoField.DAY_OF_WEEK));

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

        System.out.println(localDate2.plusDays(5));

    }
}
