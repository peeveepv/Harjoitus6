package fi.academy.harjoitukset;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;
import java.time.*;


/**
 * Created by Administrator on 2.10.2017.
 */
public class Paivamaara {
    public static void main(String[] args) {

        Date today = new Date();
        System.out.println(today);

        System.out.println("---------------------------");

        Calendar today1 = Calendar.getInstance();
        System.out.println(today1);
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println(gcal);

        System.out.println("---------------------------");

        LocalDate today2 = LocalDate.now();
        System.out.println(today2);

        System.out.println("---------------------------");

        LocalDateTime today3 = LocalDateTime.now();
        System.out.println(today3);

        System.out.println("---------------------------");

        System.out.println("-------------2-------------");

        Calendar kalenteri = new GregorianCalendar(2017, 1, 1);
        Date date = kalenteri.getTime();

        System.out.println(date);

        System.out.println("------------3--------------");




    }
}
