package miniprojekt4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {

    public LocalDateTime idopont;

    enum TranzakcioTipus {
        DEPOSIT,
        WITHDRAW;
    }

    TranzakcioTipus tranzTipus;
    public double osszeg;

    public Tranzakcio(TranzakcioTipus tranztipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranztipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "(Időpont: " + this.idopont.format(formatter) +
                ", Tranzakció Típus: " + tranzTipus +
                ", Összeg: " + osszeg + ")";
    }

}
