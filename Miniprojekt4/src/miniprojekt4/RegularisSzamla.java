package miniprojekt4;

import java.util.List;
import java.util.ArrayList;

public class RegularisSzamla implements BankSzamla {

    protected double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    private static int kovSzamlaSzam = 1;
    protected List<Tranzakcio> tranzakciok;

    private void ujSzamlaSzam() {
        this.szamlaSzam = kovSzamlaSzam++;
    }

    public RegularisSzamla(String tulNev) {
        ujSzamlaSzam();
        this.egyenleg = 0;
        this.tulNev = tulNev;
        tranzakciok = new ArrayList<>();
    }

    public double getEgyenleg() {
        return egyenleg;
    }

    public void betesz(double osszeg) {
        egyenleg = egyenleg + osszeg;
        tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT, osszeg));
        System.out.println("Sikeres művelet! Befizetett " + osszeg + " összeget a számlára!");
    }

    public void kivesz(double osszeg) {

        if ((egyenleg - osszeg) < 0 || egyenleg <= 0) {
            System.out.println("Sikertelen művelet! Nincs elég egyenleg a számlán a tranzakció elvégzéséhez!");
        }

        else {
            this.egyenleg = egyenleg - osszeg;
            tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.WITHDRAW, osszeg));
            System.out.println("Sikeres művelet! Kivett  " + osszeg + " összeget a számláról!" );
        }

    }

    @Override
    public String toString() {
        return "RegulárisSzámla{" +
                "\nSzámlaszám: " + szamlaSzam +
                "\nTulajdonos: " + tulNev +
                "\nEgyenleg: " + egyenleg +
                "\nTranzakciók: " + tranzakciok +
                "\n}";
    }

}
