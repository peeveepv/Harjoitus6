package fi.academy.harjoitukset.Viikko1.keskiviikko; /**
 * Created by Administrator on 26.9.2017.
 */
/**
 * Created by Administrator on 26.9.2017.
 */
import java.util.Scanner;

public class Main {

    public static double kertoma(double luku) {
        double tulos = 1;

        for (double i = 1; i <= luku; i++) {
            tulos = tulos * i;
        }
        return tulos;
    }


    public static void main(String[] args){
        double luku;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Anna luku, jolle kertoma lasketaan: ");
            luku = in.nextDouble();
        }catch (Exception e) {
            System.err.println("Ongelma lukemisessa" + e.getMessage());
            System.err.println("Ohjelma lopetetaan..");
            return;
        }

        System.out.println(String.format("%f! on: %f", luku, kertoma(luku)));
    }
}

