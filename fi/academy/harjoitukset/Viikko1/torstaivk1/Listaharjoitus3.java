package fi.academy.harjoitukset.Viikko1.torstaivk1;

/**
 * Created by Administrator on 28.9.2017.
 */
public class Listaharjoitus3 {

    public static void main(String[] args) {


        Luettelo luettelo = new Luettelo();

        // public static Henkilo[] hlot = {
              //  new Henkilo("John", "Doe", 21),
                // new Henkilo("Jane", "Doe", 28),
                // new Henkilo("Steven", "Tyler", 55),
                //new Henkilo("Matt", "Mulligan", 21),
                //new Henkilo("James", "Gosling", 55)};

    Henkilo hlot =
            new Henkilo("John", "Doe", 21);
        if (luettelo.onkoNimea(hlot)) {
            System.out.println(hlot + " löytyi");
        } else {
            System.out.println(hlot + " ei löydy");

    }

                                                    //Uusi luettelo
        luettelo.tulostaKaikki();               //Katsotaan että tulostus onnistuu

        luettelo.poistaPaat();

        luettelo.tulostaKaikki();

        //System.out.println(luettelo.onkoNimea("Riku"));     //true
        //System.out.println(luettelo.onkoNimea("Tara"));    //false


        luettelo.getLista().clear();
        luettelo.tulostaKaikki();



    }

}



// me voimme koodata luokan parametriksi metodille


//    if (1=1) return;


//          public void tulostaSukunimenPituudenMukaan() {
//          // Stream API, sort, ei muuta alkuperäistä listaa
//          lista.stream()
//                   .sorted((h1,h2)->h1.getSukunimi().lenght()-h2.getSukunimi().lenght())
//                   .forEach(System.out::println);     <---- kertoo metodin nimen, mitä halutaan sen kutsuvan
//
//
