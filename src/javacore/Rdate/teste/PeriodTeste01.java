package javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().plusYears(2).plusDays(3);

        Period period = Period.between(localDate1, localDate2);

        System.out.println(period.getDays());
        System.out.println(period.getYears());
        System.out.println(period);

        System.out.println(localDate1.until(localDate2));
    }
}
