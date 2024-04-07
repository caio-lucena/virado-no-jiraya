/*
    parse: string p/ objeto
    formatt: objeto p/ strings
*/

package javacore.Rdate.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        String dateStr = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(dateStr);

        LocalDate dateParse = LocalDate.parse("20240407", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dateParse);

        String formatoBr = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Formato BR: " + formatoBr);

    }
}
