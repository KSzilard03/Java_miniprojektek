package miniprojekt5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes(new Jegy("Matek", 10));
        hallgato.ujBejegyzes(new Jegy("Matek", 8));
        hallgato.ujBejegyzes(new Jegy("Roman", 7));
        hallgato.ujBejegyzes(new Jegy("Roman", 8));
        hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        hallgato.listazas();

        System.out.println();

        Naplo naplo0 = new Naplo("eallgarok.csv");

        System.out.println();

        Naplo naplo = new Naplo("hallgatok.csv");
        naplo.listazNevek();

        System.out.println();

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader("jegyek.csv"));

            String sor;

            while ((sor = br.readLine()) != null) {

                String[] adatok = sor.split(",");

                if (adatok.length >= 3) {
                    int hallgatoID = Integer.parseInt(adatok[0]);
                    String tantargy = adatok[1];
                    int hallgatoJegy = Integer.parseInt(adatok[2]);
                    naplo.ujJegy(hallgatoID, new Jegy(tantargy, hallgatoJegy));
                }

            }

        }

        catch (FileNotFoundException fe) {

            System.out.println("Hiba a jegyek beolvasásakor! Nem sikerült megtalálni a fájlt: " + " jegyek.csv");

        }

        catch (IOException ie) {

            System.out.println("Hiba a jegyek beolvasásakor! Nem sikerült beolvasni a fájlt: " + " jegyek.csv");

        }

        finally {

            if (br != null) {

                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Hiba a BufferedReader lezárásakor!");
                }

            }

        }

        naplo.listazHallgatoiAdatok();

    }

}
