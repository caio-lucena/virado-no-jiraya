package javacore.Sformatcao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class LocaleTeste02 {
    public static void main(String[] args) {

        Locale localJp = new Locale("ja", "jp");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormatJp = DateFormat.getDateInstance(DateFormat.FULL, localJp);

        System.out.println("Tradução para japonês: " + dateFormatJp.format(calendar.getTime()));

    }
}
