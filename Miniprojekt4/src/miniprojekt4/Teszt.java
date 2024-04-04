package miniprojekt4;

public class Teszt {

    public static void main(String[] args) {

        RegularisSzamla regSzamla1 = new RegularisSzamla("Első Reguláris Számlás");
        RegularisSzamla regSzamla2 = new RegularisSzamla("Második Reguláris Számlás");

        System.out.println();

        regSzamla1.kivesz(50);
        regSzamla1.betesz(200);

        System.out.println();

        System.out.println(regSzamla1);

        System.out.println();

        regSzamla2.betesz(1500);
        regSzamla2.kivesz(800);
        System.out.println(regSzamla2);

        System.out.println();

        FolyoSzamla folySzamla1 = new FolyoSzamla("Első Folyószámlás");
        FolyoSzamla folySzamla2 = new FolyoSzamla("Második Folyoszámlás");

        folySzamla1.betesz(800);
        folySzamla1.kivesz(100);
        folySzamla1.kivesz(100);
        folySzamla1.kivesz(100);
        folySzamla1.levonKoltseg();
        System.out.println("Egyenleg: " + folySzamla1.getEgyenleg());

        System.out.println();

        folySzamla2.kivesz(200);
        folySzamla2.betesz(5000);
        folySzamla2.levonKoltseg();
        System.out.println(folySzamla2.getEgyenleg());

        System.out.println();

        System.out.println("folySzamla1 == folySzamla2 - " + folySzamla1.equals(folySzamla2));
        System.out.println("folSzamla2 == folySzamla2 - " + folySzamla2.equals(folySzamla2));

        System.out.println();

        TakarekSzamla takSzamla1 = new TakarekSzamla("Első Takarékos", 2.0);
        TakarekSzamla takSzamla2 = new TakarekSzamla("Második Takarékos", 1.0);

        takSzamla1.betesz(100);
        takSzamla1.kivesz(100);
        takSzamla1.setKamatRata(10.0);
        takSzamla1.hozzaadKamat();

        System.out.println();

        System.out.println(takSzamla1);

        System.out.println();

        takSzamla2.betesz(1000);
        takSzamla2.betesz(1000);
        takSzamla2.kivesz(4000);
        takSzamla2.setKamatRata(10.0);
        takSzamla2.hozzaadKamat();

        System.out.println();

        System.out.println(takSzamla2);

        System.out.println();

        System.out.println("takSzamla1 == takSzamla2 - " + takSzamla1.equals(takSzamla2));
        System.out.println("takSzamla1 == takSzamla1 - " + takSzamla1.equals(takSzamla1));

    }

}
