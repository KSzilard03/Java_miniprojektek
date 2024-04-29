package miniprojekt5;

import java.util.ArrayList;

public class Hallgato {

    private static int kovID = 0;
    private final int ID;
    private final String vezeteknev;
    private final String keresztnev;
    private ArrayList<Jegy> jegyek;

    public Hallgato(String vezeteknev, String keresztnev) {
        this.ID = kovID++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.jegyek = new ArrayList<Jegy>();
    }

    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public ArrayList<Jegy> getJegyek() {
        return jegyek;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public double tantargyAtlag(String tantargyNev) {

        double osszeg = 0;
        int db = 0;

        for(Jegy jegy: jegyek) {

            if (jegy.getTantargy().equals(tantargyNev)) {
                osszeg += jegy.getErtekeles();
                db++;
            }

        }

        if (db == 0) {
            return 0;
        } else {
            return osszeg / db;
        }

    }

    public ArrayList<String> getTantargyak() {

        ArrayList<String> tantargyak = new ArrayList<String>();

        for (Jegy jegy: jegyek) {

            String tantargy = jegy.getTantargy();

            if (!tantargyak.contains(tantargy)) {
                tantargyak.add(tantargy);
            }

        }

        return tantargyak;

    }

    public void listazas() {

        System.out.println(vezeteknev + " " + keresztnev);

        for (String tantargy : getTantargyak()) {

            double atlag = tantargyAtlag(tantargy);

            if (atlag != 0) {
                System.out.println("\t" + tantargy + ": " + atlag);
            }

        }

    }

}
