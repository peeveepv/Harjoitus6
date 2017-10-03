package fi.academy.harjoitukset.Viikko1.tiistai;

/**
 * Created by Administrator on 26.9.2017.
 */
public class HenkiloMain {
    public static void main(String[] args) {


        Henkilo[]hlot = {

                new Henkilo("John", "Doe", 21),
                new Henkilo("Jane", "Doe", 28),
                new Henkilo("John", "Doe", 55),
                new Henkilo("Eero", "Deere", 2),
                new Henkilo("James", "Gosling", 55)

        };

        for(Henkilo h: hlot) {
            System.out.println(h);
        }
        Henkilo john = new Henkilo("John", "Doe", 21);
        System.out.println(hlot[0] == john); // false, koska vaikka arvot on samat, se ei ole sama olio.
        System.out.println(hlot[0].equals(john)); // true

        john = new Henkilo();
        try {
            john.setNimi(null);
        }catch (NullPointerException e) {
            System.out.println("VIIIRHE");
        }

    }
}
