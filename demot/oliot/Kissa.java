package demot.oliot;

/**
 * Created by Administrator on 26.9.2017.
 */
public class Kissa {
    private final String rotu;
    private String nimi;
    private int ikä;

    public Kissa(String rotu) {
        this.rotu = rotu;       // this. asettaa tälle rodulle rodun.
        this.nimi = nimi;
    }

    public Kissa() {                // tämä luotiin testiluokasta alt enterin, create constructor
        this ("maatiainen");          // vois olla myös rotu = "maatioainen"
                                    //vois olla nimi = "nimetön"
                                    // kun toisella tapaa, nyt sen roduksi tulee maatiainen ja nimeksi nimetön. Etu
    }

    public Kissa(int ikä) {
        this("Maatianen");
        setIkä(ikä);
    }

    public void kuseksi() {
        System.out.println("pss");

    }

    public String getRotu() {
        return rotu;
    }

    public String getNimi() {

        return nimi;
    }

    public void setNimi(String nimi) {

        this.nimi = nimi;
    }

    public int getIkä()
    {
        return ikä;
    }

    public void setIkä(int ikä) {

        this.ikä = ikä;
    }

    @Override                               // käyttäkää @Overridea!
    public String toString() {
        return "Kissa{" +
                "rotu='" + rotu + '\'' +
                ", nimi='" + nimi + '\'' +
                ", ikä=" + ikä +
                '}';
    }
}
