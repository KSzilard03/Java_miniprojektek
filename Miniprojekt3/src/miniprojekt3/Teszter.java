package miniprojekt3;

import java.util.ArrayList;
import java.util.Comparator;

public class Teszter {

    public static void main(String[] args) {

        ArrayList<Film> filmek = new ArrayList<>();

        filmek.add(new Film("Aquaman",  1500));
        filmek.add(new Film("Star Wars",  1000));
        filmek.add(new Film("Csillagok között",  2000));
        filmek.add(new Film("Az otthagyottak",  800));
        filmek.add(new Film("Titanic",  2100));
        filmek.add(new Film("Barbie",  550));
        filmek.add(new HorrorFilm("A bohócrém", 700, 20));
        filmek.add(new HorrorFilm("Démonok között", 2300, 16));
        filmek.add(new HorrorFilm("Fűrész", 1700, 18));
        filmek.add(new HorrorFilm("Az", 2800, 16));
        filmek.add(new HorrorFilm("Halloween", 2300, 18));
        filmek.add(new HorrorFilm("Sikoly", 600, 14));

        System.out.println("Filmek: ");

        for (Film film: filmek) {
            System.out.println(film);
        }

        System.out.println();

        filmek.sort(Comparator.comparingInt(Film::getAr));

        System.out.println("Filmek ár szerint: ");

        for (Film film: filmek) {
            System.out.println(film);
        }

        ArrayList<IKorhataros> korHataros = new ArrayList<>();

        for (Film film: filmek) {
            if (film instanceof HorrorFilm) {
                korHataros.add((HorrorFilm) film);
            }
        }

        System.out.println();

        System.out.println("Horrorfilmek");

        for (IKorhataros film: korHataros) {
            System.out.println(film);
        }

        System.out.println();

        int megadottKor = 18;
        int osszBuntetes = 0;

        for(IKorhataros film: korHataros) {

            osszBuntetes = osszBuntetes + film.Buntetes(megadottKor);

        }

        System.out.println("Az összesen fizetendő büntetés: " + osszBuntetes);

    }

}
