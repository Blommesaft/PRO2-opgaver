package Opgave02;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Bibliotek {

    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     * beregnetDato < faktiskDato
     * (beregnetDato er forventet afleveringsdato og
     * faktiskDato er den dag bogen blev afleveret; voksen er
     * sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {

        long days = DAYS.between(beregnetDato, faktiskDato);

        if (days == 0) {
            return 0;
        } else if (days < 8) {
            return voksen ? 20 : 10;
        } else if (days < 14) {
            return voksen ? 60 : 30;
        }
        return 0;
    }
}
