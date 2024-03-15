package miniprojekt3;

public class Film {

    protected String cim;
    protected int ar;
    protected int[] velemenyek;
    protected int velemenyekSzama;

    public Film(String cim, int ar) {

        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
        this.velemenyekSzama = 0;

    }

    public String getCim() {
        return cim;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {

        if (velemeny < 1 && velemeny > 5 ) {
            System.out.println("A véleménynek 1 és 5 közötti számnak kell lennie!");
        }

        else {
            velemenyek[velemenyekSzama++] = velemeny;
        }

    }

    public double Atlag() {

        if (velemenyekSzama < 0) {

            System.out.println("A film még nem kapott egy véleményt sem!");
            return 0;

        }

        else {

            int osszeg = 0;
            double eredmeny = 0;

            for (int velemeny: velemenyek) {

                osszeg = osszeg + velemeny;

            }

            eredmeny = osszeg / velemenyekSzama;
            return eredmeny;

        }

    }

    @Override
    public String toString() {
        return "Film címe: " + getCim() + ", Film ára: " + getAr();
    }

}
