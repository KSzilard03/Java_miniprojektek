package miniprojekt5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Naplo {

    private ArrayList<Hallgato> hallgatok;

    public Naplo(String fajlnev) {
        this.hallgatok = new ArrayList<Hallgato>();
        beolvas(fajlnev);
    }

    private void beolvas(String fajlnev) {

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(fajlnev));

            String sor;

            while ((sor = br.readLine()) != null) {

                String[] adatok = sor.split(",");

                if (adatok.length >= 2) {
                    String vezeteknev = adatok[0];
                    String keresztnev = adatok[1];
                    Hallgato hallgato = new Hallgato(vezeteknev, keresztnev);
                    hallgatok.add(hallgato);
                }

            }

        }

        catch (FileNotFoundException fe) {

            System.out.println("Hiba a napló beolvasásakor! Nem sikerült megtalálni a fájlt: " + fajlnev);

        }

        catch (IOException ie) {

            System.out.println("Hiba a hallgató beolvasásakor! Nem sikerült beolvasni a fájlt: " + fajlnev);

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

    }

    public void listazNevek() {

        for (Hallgato hallgato: hallgatok) {
            System.out.println(hallgato.getID() + ". " + hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
        }

    }

    public void ujJegy(int ID, Jegy jegy) {

        for (Hallgato hallgato: hallgatok) {

            if (hallgato.getID() == ID) {
                hallgato.ujBejegyzes(jegy);
                break;
            }

        }

    }

    public void listazHallgatoiAdatok() {

        for (Hallgato hallgato: hallgatok) {

            System.out.println(hallgato.getVezeteknev() + " " + hallgato.getKeresztnev() + ": ");
            ArrayList<String> tantargyak = hallgato.getTantargyak();

            for (String tantargy: tantargyak) {

                double atlag = hallgato.tantargyAtlag(tantargy);

                if (atlag != 0) {
                    System.out.println("\t" + tantargy + ": " + String.format("%.2f", atlag));
                }

                else {
                    System.out.println("\t" + tantargy + "-");
                }

            }

            System.out.println();

        }

    }

}
