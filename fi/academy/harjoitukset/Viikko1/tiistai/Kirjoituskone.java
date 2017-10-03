package fi.academy.harjoitukset.Viikko1.tiistai;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Administrator on 27.9.2017.
 */

public class Kirjoituskone {

    Scanner lukija = new Scanner(System.in);
    public static void main(String[] args) {


        String Tiedosto = "C:\\Users\\Administrator\\Documents\\IdeaProjects\\TMCProjects\\2016-nodl-ohjelmointi\\Harjoitus1\\src\\fi\\academy\\harjoitukset\\tiedosto.txt";

        BufferedWriter bw = null;
        FileWriter fw = null;


        try {
            Scanner lukija = new Scanner(System.in);
            String sisältö = "\n" + lukija.nextLine();

            fw = new FileWriter(Tiedosto, true);
            bw = new BufferedWriter(fw);
            bw.write(sisältö);

            System.out.println("Onnistui");


        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}