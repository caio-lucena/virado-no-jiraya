package javacore.Sformatcao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {

        String formatter = "'Osasco,'yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatter);

        Date date = new Date();

        System.out.println(simpleDateFormat.format(date));

        try {
            System.out.println(simpleDateFormat.parse("Osasco,2024.02.25 d.C. at 21:30:41 BRT"));
        }
        catch (ParseException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
