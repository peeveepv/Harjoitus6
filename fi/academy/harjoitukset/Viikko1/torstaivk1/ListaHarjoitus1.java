package fi.academy.harjoitukset.Viikko1.torstaivk1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 28.9.2017.
 */
public class ListaHarjoitus1 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList();

        lista.add("Anna");
        lista.add("Eero");
        lista.add("Pekka");
        lista.add("Tuukka");
        lista.add("Joonas");
        lista.remove("Eero");
        tulostaLista(lista);


        // JOTAIN                 lista.remove("Anna")

        for (Iterator<String> it = lista.iterator(); it.hasNext() ; ) {
            String alkio = it.next();
            if (alkio.startsWith("T"))
                it.remove();

        }
        System.out.println("----------");
        tulostaLista(lista);
    }

        public static void tulostaLista(List<?> lista) {
        for (Object alkio: lista) {
            System.out.println(alkio);

    }
}}
