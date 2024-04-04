package miniprojekt4;

import java.util.Objects;

public class FolyoSzamla extends RegularisSzamla {

    protected int tranzakciokSzama;
    protected final static int INGYENES_TRANZ_SZAMA = 3;
    protected final static double TRANZAKCIO_ARA = 2.0;

    public FolyoSzamla (String tulNev) {
        super(tulNev);
        this.tranzakciokSzama = 0;
    }

    public void betesz(double osszeg) {
        tranzakciokSzama++;
        super.betesz(osszeg);
        levonKoltseg();
    }

    public void kivesz(double osszeg) {
        tranzakciokSzama++;
        super.kivesz(osszeg);
        levonKoltseg();
    }

    public void levonKoltseg() {
        if (tranzakciokSzama > INGYENES_TRANZ_SZAMA) {
            double levonOsszeg = TRANZAKCIO_ARA  * (tranzakciokSzama - INGYENES_TRANZ_SZAMA);
            egyenleg -= levonOsszeg;
            System.out.println("A tranzakció költsége: " + levonOsszeg);
            tranzakciokSzama = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FolyoSzamla that = (FolyoSzamla) o;
        return Objects.equals(tulNev, that.tulNev) &&
                Objects.equals(szamlaSzam, that.szamlaSzam) &&
                Objects.equals(tranzakciokSzama, that.tranzakciokSzama);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranzakciokSzama);
    }

    @Override
    public String toString() {
        return "FolyóSzámla{" +
                "\nSzámlaszám: " + szamlaSzam +
                "\nTulajdonos: " + tulNev +
                "\nEgyenleg: " + egyenleg +
                "\nTranzakciók ára: " + TRANZAKCIO_ARA +
                "\nTranzakciók száma: " + tranzakciokSzama +
                "\nIngyenes tranzakciók száma: "  + INGYENES_TRANZ_SZAMA +
                "\nTranzakciók: " + tranzakciok +
                "\n}";
    }

}
