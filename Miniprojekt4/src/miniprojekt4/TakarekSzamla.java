package miniprojekt4;

import java.util.Objects;

public class TakarekSzamla extends RegularisSzamla {

    protected double kamatRata;

    public TakarekSzamla(String tulNev, double kamat) {
        super(tulNev);
        this.kamatRata = kamat;
    }

    public void hozzaadKamat() {
        egyenleg += egyenleg * (kamatRata / 100);
    }

    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamatRata) {
        this.kamatRata = kamatRata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakarekSzamla that = (TakarekSzamla) o;
        return Objects.equals(tulNev, that.tulNev) &&
                Objects.equals(szamlaSzam, that.szamlaSzam) &&
                Objects.equals(kamatRata, that.kamatRata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kamatRata);
    }

    @Override
    public String toString() {
        return "TakarékSzámla{" +
                "\nSzámlaszám: " + szamlaSzam +
                "\nTulajdonos: " + tulNev +
                "\nEgyenleg: " + egyenleg +
                "\nKamatráta: " + kamatRata +
                "\n}";
    }

}
