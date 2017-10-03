package fi.academy.harjoitukset.Viikko1.torstaivk1;


import java.util.ArrayList;
import java.util.List;

class Luettelo {
    private List<Henkilo> lista;


    public Luettelo() {

        Henkilo[] hlot = {
        new Henkilo("John", "Doe", 21),
        new Henkilo("Jane", "Doe", 28),
        new Henkilo("Steven", "Tyler", 55),
        new Henkilo("Matt", "Mulligan", 21),
        new Henkilo("James", "Gosling", 55)};

        this.lista = new ArrayList<>();

        for (int i = 0; i < hlot.length; i++)  {

            Henkilo x = hlot[i];

            this.lista.add(hlot[i]);

        }

    }

    public void tulostaKaikki() {
        System.out.println("\n ----------------- \n");
        int lukumäärä = lista.size();
        System.out.println("Listalla nimiä: " + lukumäärä);

        for(Henkilo nimi : lista) {
            System.out.println(nimi);
        }
    }

    public void poistaPaat() {
        lista.remove(0);     // poistaa listan ensimmäisen alkion

        lista.remove(lista.size() - 1);

    }


    public boolean onkoNimea(Henkilo nimi) {

        return lista.contains(nimi);
    }

    public List<Henkilo> getLista() {
        return lista;
    }

    public void setLista(List<Henkilo> lista) {
        this.lista = lista;

    }
}


