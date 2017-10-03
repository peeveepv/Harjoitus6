package fi.academy.harjoitukset.Maanantai;

/**
 * Created by Administrator on 2.10.2017.
 */
public class Viikonpaivat {
    public static void main(String[] args) {

        String[] paivat = {"maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai", "sunnuntai"};
        StringBuilder viikonpaivat = new StringBuilder();

        for (String paiva: paivat) {

            paiva = paiva.substring(0,1).toUpperCase() + paiva.substring(1);

            viikonpaivat.append(paiva + "\n");

        }

        System.out.println(viikonpaivat.toString());

    }
}