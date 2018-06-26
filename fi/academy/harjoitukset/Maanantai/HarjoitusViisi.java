package fi.academy.harjoitukset.Maanantai;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by Administrator on 2.10.2017.
 */
public class HarjoitusViisi {
    public static void main(String[] args) {
        System.out.println("Tere");

        LocalDate tanaan = LocalDate.now();

        LocalDate syntymapaiva = LocalDate.of( 1992 , 1 , 19 );

        System.out.println(tanaan);
        System.out.println(syntymapaiva);

        Period p = Period.between(tanaan, syntymapaiva);
        System.out.println(p);

        long paiva = Duration.between(syntymapaiva.atStartOfDay(), tanaan.atStartOfDay()).toDays();

        System.out.println(paiva);
    }
}
