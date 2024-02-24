package javacore.Rdate.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTeste01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();

        DateFormat [] dateFormats = new DateFormat[7];

        dateFormats[0] = DateFormat.getInstance();
        dateFormats[1] = DateFormat.getDateInstance();
        dateFormats[2] = DateFormat.getDateTimeInstance();
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.FULL);
        dateFormats[6] = DateFormat.getDateInstance(DateFormat.LONG);

        for(DateFormat dateFormat: dateFormats){
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }
}
