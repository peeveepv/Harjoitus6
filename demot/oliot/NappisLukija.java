package demot.oliot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 27.9.2017.
 */
public class NappisLukija {                             // STREAMIEN KÄSITTELYÄ ESIMERKKI
    public static void main(String[] args) {
        String rivi = null;


        try (BufferedReader lukija =                                        // try jälkeen sulkeissa on resursseja,
                new BufferedReader(new InputStreamReader(System.in))) {     // näille kutsutaan close metodia
            rivi = lukija.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Annoit: " + rivi);
    }
}
