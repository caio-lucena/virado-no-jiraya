package javacore.Rdate.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agoraPosTimeSkip = LocalDateTime.now().plusYears(2);

        System.out.println(agora.getYear());
        System.out.println(agoraPosTimeSkip.getYear());

        Duration duration1 = Duration.between(agora, agoraPosTimeSkip);
        Duration duration2 = Duration.between(Instant.now(), Instant.now().plusSeconds(3000L));

        System.out.println(duration1.toDays());
        System.out.println(duration2);
        System.out.println(Duration.ofDays(30));

    }
}
