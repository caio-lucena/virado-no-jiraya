package javacore.Rdate.teste;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

//vídeo 128 na playlist

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId australiaZone = ZoneId.of("Australia/Darwin");
        ZoneId japanZone = ZoneId.of("Asia/Tokyo");

        System.out.println(australiaZone);
        LocalDateTime localDateTime = LocalDateTime.now(australiaZone);
        System.out.println("Hora na Austrália: " + localDateTime);

        ZonedDateTime zonedDateTime = localDateTime.atZone(japanZone);
        System.out.println("Hora no Japão: " + zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant.atZone(australiaZone));

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset spZone = ZoneOffset.of("-03:00");
        System.out.println(spZone);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

    }
}
