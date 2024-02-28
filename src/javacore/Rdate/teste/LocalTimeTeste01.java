package javacore.Rdate.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.now();

        System.out.println(
            localTime1.getHour()
            + ":" +
            localTime1.getMinute()
            + ":" +
            localTime1.getSecond()
        );

        System.out.println(localTime1.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
