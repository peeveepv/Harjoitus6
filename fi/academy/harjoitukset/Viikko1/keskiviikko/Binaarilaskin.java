package fi.academy.harjoitukset.Viikko1.keskiviikko; /**
 * Created by Administrator on 26.9.2017.
 */
import java.util.Scanner;

public class Binaarilaskin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long luku1, luku2;

        luku1 = Long.parseLong(in.next(), 2);
        luku2 = Long.parseLong(in.next(), 2);
        System.out.println(Long.toBinaryString(luku1)
                + " + "
                + Long.toBinaryString(luku2)
                + " = "
                + Long.toBinaryString(luku1+luku2));




    }
}
