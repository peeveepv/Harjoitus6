package fi.academy.harjoitukset.Viikko1.keskiviikko; /**
 * Created by Administrator on 27.9.2017.
 */


import java.util.*;

public class Hello {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lista.add(i);
        }
        int luku = 0;
        for (int x : lista) {
            luku += x;
        }
        System.out.println(luku);
    }
}