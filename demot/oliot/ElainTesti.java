package demot.oliot;

/**
 * Created by Administrator on 26.9.2017.
 */
public class ElainTesti {
    public static void main(String[] args) {    // ei tarvitse importoida, koska samassa paketissa!
        Kissa katti = new Kissa(-1);
        System.out.println(katti.getIkä());
        System.out.println(katti.toString());
        katti.setNimi("Pekka");
        katti.setIkä(-1);

        katti.kuseksi();
    }
}
