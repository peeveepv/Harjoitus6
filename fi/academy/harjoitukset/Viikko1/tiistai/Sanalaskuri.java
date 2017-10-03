package fi.academy.harjoitukset.Viikko1.tiistai;

import java.io.*;

/**
 * Created by Administrator on 27.9.2017.
 */
public class Sanalaskuri {
    public static void main(String[] args) {
        String tiedostonnimi;
        if(args.length > 0) {
            tiedostonnimi = args[0];
        } else {
            System.out.println("Käytetään oletustiedostonimeä");
            tiedostonnimi = "src/fi/academy/harjoitukset/Sanalaskuri.java";
        }
        Sanalaskuri laskuri = new Sanalaskuri();
        laskuri.kasitteleTiedosto(tiedostonnimi);
    }

    private void kasitteleTiedosto(String nimi) {
        int sanat = 0, merkit=0, rivit=0;               //paikalliset muuttujat pitää alustaa, jäsenmuuttujia ei tarvitse
        try (BufferedReader lukija = new BufferedReader(new FileReader(nimi))) {
            for(String rivi = lukija.readLine() ; rivi != null ; rivi = lukija.readLine()) {    // lukee niin kauan kunnes rivi on null
                rivit ++;
                merkit += rivi.length() + 1;
                String[] sanatrivilla = rivi.split(" ");        // splitataan rivi, strign regex, säännönmukaiset lausekkeet, minkä perusteella jaetaan
                int sanoja = sanatrivilla.length;                              // nyt jaettiin välilyönnillä
                sanat += sanoja;
            }

            System.out.println("------ " + nimi + " -------");
            System.out.println("\t" + rivit + "\t" + sanat + "\t" + merkit);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
