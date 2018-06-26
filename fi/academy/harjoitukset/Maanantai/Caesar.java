package fi.academy.harjoitukset.Maanantai;
import java.util.Scanner;
import java.io.*;

/**
 * Created by Administrator on 2.10.2017.

 public class Caesar {

    public static void main(String[] args) {
        String merkkijono = "salainen";
        Caesar salaaja = new Caesar();
        String salattu = salaaja.salaa(merkkijono);
        System.out.println(salattu);
    }

    private String salaa(String merkkijono) {
        String uusi = "";
        for (int i = 0; i < merkkijono.length(); ++i) {
            uusi += merkkijono.charAt(i);
        }
        return uusi;
    }
}
*/



