package fi.academy.harjoitukset.Viikko1.torstaivk1;

// Huom ei public class, joten voi sijaita samassa tiedostossa, kuin listaHarjoitus2 luokka

class Henkilo {
    private String etunimi;
    private String sukunimi;
    private int ika;

    public Henkilo(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
    }

    public Henkilo() {
        this.etunimi = "";
        this.sukunimi = "";
        this.ika = 0;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    @Override
    public String toString() {
        return "Henkilo{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", ika=" + ika +
                '}';
    }

    @Override
    public boolean equals(Object x) {

        Henkilo h = (Henkilo) x;
        if (this.etunimi.equals((h.etunimi))
                && this.sukunimi.equals(h.sukunimi)
                && this.ika == h.ika) {
            return true;
        }
        return false;
    }
}

