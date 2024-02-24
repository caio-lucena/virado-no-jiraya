package javacore.Rdate.teste;

import java.util.Calendar;
import java.util.Date;

// Calendar é uma classe abstrata
public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(calendar.get(
                Calendar.YEAR)
                + "/"
                + calendar.get(Calendar.MONTH)
                + "/"
                + calendar.get(Calendar.DAY_OF_MONTH)
        );

        System.out.println(calendar);

        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.roll(Calendar.HOUR ,38);

        Date date = calendar.getTime();

        System.out.println(calendar);
        System.out.println(date);
    }

}
