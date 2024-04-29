package miniprojekt5;

public class Jegy {

    private final String tantargynev;
    private final double ertekeles;

    public Jegy(String tantargynev, double ertekeles) {
        this.tantargynev = tantargynev;
        this.ertekeles = ertekeles;
    }

    public String getTantargy() {
        return tantargynev;
    }

    public double getErtekeles() {
        return ertekeles;
    }

    @Override
    public String toString() {
        return tantargynev + ": " + ertekeles;
    }

}
