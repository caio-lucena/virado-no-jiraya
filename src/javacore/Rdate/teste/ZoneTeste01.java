package javacore.Rdate.teste;

import java.time.*;
import java.util.Map;

//vídeo 128 na playlist

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId australiaZone = ZoneId.of("Australia/Darwin");

        System.out.println(australiaZone);
        LocalDateTime localDateTime = LocalDateTime.now(australiaZone);

        System.out.println("Hora na Austrália: " + localDateTime);

        Instant instant = Instant.now();
        System.out.println(instant.atZone(australiaZone));

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneSP = ZoneOffset.of("-03:00");
        System.out.println(zoneSP);

    }
}
