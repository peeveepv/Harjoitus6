package fi.academy.harjoitukset.Viikko1.tiistai;

/**
 * Created by Administrator on 26.9.2017.
 */
public class Henkilo {
    private String nimi;
    private String sukunimi;
    private int ikä;
    private final int id;               // koska final laitettiin tänne, ohjelma ei käänny varmasti ennen kuin jokaisella on id
    private static int seuraavaID = 1;

    public Henkilo(String nimi, String sukunimi, int ikä) throws LaitonIkaException {

        if (nimi == null)
            throw new LaitonIkaException("Nimi ei saa olla null");

        if (ikä < 0 || ikä > 120)
            throw new LaitonIkaException("Ikä on väärin!");

        this.nimi = nimi;
        this.sukunimi = sukunimi;
        this.ikä = ikä;
        id = seuraavaID++;


    }

    public Henkilo() throws LaitonIkaException {
        this("N", "N", 0);


    }



    public String getNimi() {

        return nimi;

    }

    public void setNimi(String nimi) throws LaitonIkaException {

        if (nimi == null)

            throw new LaitonIkaException("Nimi ei saa olla null");

        this.nimi = nimi;
    }

    public String getSukunimi() {

        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIkä() {

        return ikä;
    }

    public void setIkä(int ikä) throws LaitonIkaException{

        if (ikä < 0 || ikä > 120)

            throw new LaitonIkaException("Ikä on väärin");
        this.ikä = ikä;
    }


    @Override
    public String toString() {
        return "Henkilo{" +
                "nimi='" + nimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", ikä=" + ikä +
                ", id=" + id +
                '}';
    }


    public boolean equals(Object x) {
        Henkilo h = (Henkilo) x;
        if (this.nimi.equals((h.nimi))
                && this.sukunimi.equals(h.sukunimi)
                && this.ikä == h.ikä) {
            return true;
        }
        return false;
    }

}
