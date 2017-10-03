package fi.academy.harjoitukset.Maanantai;

/**
 * Created by Administrator on 2.10.2017.


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KukkaHarjoitus {
    public static void main(String[] args) throws FileNotFoundException {
       // System.out.println(String.format("Katenointi: %.4fus", merkkijonokatenointi() / 1000_000.0));
        System.out.println(String.format("Rakentaminen: %.4fus", merkkijonopuskurointi() / 1000_000.0));
    }

    private static long merkkijonopuskurointi() throws FileNotFoundException {
        long kesto = -1;
        String tulos = new StringBuilder();
        try (Lukija lukija = new Lukija()) {
            long alku = System.nanoTime();
            for (String s = lukija.next(); s != null; s = lukija.next()) {
                tulos.append(s);
            }
            long loppu = System.nanoTime();
            kesto = loppu - alku;
            System.out.println(tulos.toString());  // luettu merkkijono
        }
        return kesto;
    }
}

class Lukija implements AutoCloseable {
    private final static String TIEDOSTO = "C:\\Users\\Administrator\\Downloads\\flowersofevil.txt";
    private Scanner scanner;

    public Lukija() throws FileNotFoundException {
        scanner = new Scanner(new FileInputStream(TIEDOSTO));
    }

    @Override
    public void close() throws RuntimeException {
        if(scanner != null) {
            scanner.close();
            scanner = null;
        }
    }

    public String next() {
        scanner.useDelimiter("[\\s\\p{Punct}]+");
        if (scanner.hasNext()) {
            String sana = scanner.next();
            return sana + " ";
        }
        else
            return null;
    }
}
*/