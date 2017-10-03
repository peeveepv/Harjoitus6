package fi.academy.harjoitukset.Maanantai;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2.10.2017.
 */
public class Joulu {
    public static void main(String[] args) {

        LocalDate tanaan = LocalDate.now();

        LocalDate date1 = tanaan.withMonth(12);
        LocalDate date2 = date1.withDayOfMonth(24);

        System.out.println(date2);


        long paiviaJouluun = Duration.between(tanaan.atStartOfDay(), date2.atStartOfDay()).toDays();

        System.out.println(paiviaJouluun);

        if (paiviaJouluun < 0) {

            String[] viikonpaivat = {"maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai", "sunnuntai"};



        }

        if (date2.isBefore(tanaan)) {
            date2 = date2.plusYears(1);
        }

        LocalDate synttarit = LocalDate.of(2018, 1, 19);

        Calendar c = Calendar.getInstance();
        // c.setTime();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

    }
}
