package fi.academy.harjoitukset.Viikko1.keskiviikko; /**
 * Created by Administrator on 26.9.2017.
 */
import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int random = (int) (Math.random() * 100);
        System.out.println(random);


        System.out.println("Guess number between 1-100: ");


        int guesses = 1;

        while (true) {


            int guess = Integer.parseInt(lukija.nextLine());

            if (guesses >= 3) {
                System.out.println("Too many guesses, you lose! Again? Yes or no");

                String answer1 = lukija.nextLine();

                if (answer1 == "yes") {
                    continue;

                }

                if (answer1 == "no") {
                    break;
            }}

            if (guess == random) {
                System.out.println("Nice. Would you like to play again? Yes or no.");

                String answer = lukija.nextLine();

                if (answer == "yes") {
                    continue;
                }
                if (answer == "no") {
                break;
            }}

            if (guess < random) {
                System.out.println("It´s bigger!");
                guesses ++;
                continue;

            } if (guess > random) {
            System.out.println("It´s smaller!");
                guesses ++;
                continue;
            }
        }


    }
}
