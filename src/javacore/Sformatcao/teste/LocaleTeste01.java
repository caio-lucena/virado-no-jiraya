package javacore.Sformatcao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale localItaly = new Locale("it", "IT");
        Locale localArgentina = new Locale("es", "AR");
        Locale localeSpain = new Locale("es", "ES");
        Locale localeJapan = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormatIta = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat dateFormatArg = DateFormat.getDateInstance(DateFormat.FULL, localArgentina);
        DateFormat dateFormatSpa = DateFormat.getDateInstance(DateFormat.FULL, localeSpain);
        DateFormat dateFormatJp = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Data na Itália: " + dateFormatIta.format(calendar.getTime()));
        System.out.println("Data na Argentina: " + dateFormatArg.format(calendar.getTime()));
        System.out.println("Data na Espanha: " + dateFormatSpa.format(calendar.getTime()));
        System.out.println("Data no Japão: " + dateFormatJp.format(calendar.getTime()));

        System.out.println("Display Japão: " + localeJapan.getDisplayCountry());
        System.out.println("Display Espanha: " + localeSpain.getDisplayCountry(localeJapan));

    }
}
