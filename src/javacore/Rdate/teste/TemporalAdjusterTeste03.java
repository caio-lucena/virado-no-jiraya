package javacore.Rdate.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterTeste03 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(25).with(new GetNextBusinessDay());

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}

class GetNextBusinessDay implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays;

        if(dayOfWeek.getValue() == DayOfWeek.FRIDAY.getValue()){
            addDays = 3;
        }

        else if(dayOfWeek.getValue() == DayOfWeek.SATURDAY.getValue()){
            addDays = 2;
        }

        else {
            addDays = 1;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
