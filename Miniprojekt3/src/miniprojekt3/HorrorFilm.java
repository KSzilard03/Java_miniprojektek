package miniprojekt3;

public class HorrorFilm extends Film implements IKorhataros {

    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    public int Korhatar() {
        return korh;
    }

    public int Buntetes(int kor) {

        if (kor - korh < 0) {
            return Math.abs(kor - korh) * ar;
        }

        else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Film címe: " + getCim() + ", Ára: " + getAr() + ", Korhatár: " + Korhatar();
    }
}
