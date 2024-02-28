package javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1990, Month.APRIL, 13);
        LocalDate localDate2 = LocalDate.parse("2024-02-27");
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.parse("21:10:33");

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        LocalDateTime localDateTime2 = LocalDateTime.now();

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDate2);
        System.out.println(localTime2);

        LocalDateTime localDateTime3 = localTime1.atDate(localDate1);
        LocalDateTime localDateTime4 = localDate2.atTime(localTime2);

        System.out.println("Método atDate: " + localDateTime3);
        System.out.println("Método atTime: " + localDateTime4);
    }
}
