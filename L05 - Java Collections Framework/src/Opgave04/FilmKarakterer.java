package Opgave04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilmKarakterer {
    /** Sådan virker koden:
     To Maps: Vi bruger ét map til at tælle antallet af anmeldelser pr. film (filmAntal) og ét map til at holde styr på den samlede sum af karakterer pr. film (filmSum).

     Løkke (Loop): Først læses det samlede antal anmeldelser (første linje). Derefter kører en løkke, som læser filmens navn og karakter parvis.

     Beregning og Output: Til sidst løber vi listen af film igennem, beregner gennemsnittet og udskriver resultatet i det ønskede format.

     Tips til afvikling:
     Husk at oprette en fil kaldet film.txt i samme mappe som dit program (eller angiv den fulde sti til filen).

     Metoden getOrDefault(key, defaultValue) er genial her: Hvis filmen ikke findes i mappet endnu, starter den på 0. Hvis den findes, tager den den nuværende værdi og lægger 1 (eller karakteren) til.
     *
     *
     */

    public static void main(String[] args) {
        // Erstat med stien til din rigtige tekstfil, f.eks. "film.txt"
        String filNavn = "film.txt";

        // Opretter Maps til at gemme data
        Map<String, Integer> antalAnmeldelserPrFilm = new HashMap<>();
        Map<String, Integer> karakterSumPrFilm = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File(filNavn));

            // Læs den første linje, som angiver antallet af karakterer
            if (scanner.hasNextLine()) {
                int antalKarakterer = Integer.parseInt(scanner.nextLine().trim());

                // Læs alle film og karakterer
                for (int i = 0; i < antalKarakterer; i++) {
                    if (scanner.hasNextLine()) {
                        String filmNavnKarakter = scanner.nextLine().trim();
                        int karakter = Integer.parseInt(scanner.nextLine().trim());

                        // Opdater antallet af anmeldelser for filmen
                        antalAnmeldelserPrFilm.put(filmNavnKarakter, antalAnmeldelserPrFilm.getOrDefault(filmNavnKarakter, 0) + 1);

                        // Opdater den samlede sum af karakterer for filmen
                        karakterSumPrFilm.put(filmNavnKarakter, karakterSumPrFilm.getOrDefault(filmNavnKarakter, 0) + karakter);
                    }
                }
            }
            scanner.close();

            // Udskriv resultaterne
            for (String film : antalAnmeldelserPrFilm.keySet()) {
                int antal = antalAnmeldelserPrFilm.get(film);
                int sum = karakterSumPrFilm.get(film);
                double gennemsnit = (double) sum / antal;

                // Formaterer teksten baseret på om der er 1 eller flere karakterer
                String karakterTekst = (antal == 1) ? "karakter" : "karakterer";

                // Udskriver med ét decimaltegn (og bruger printf for at få dansk komma, hvis computeren er sat til det)
                System.out.printf("%s: %d %s, gennemsnit %.1f%n", film, antal, karakterTekst, gennemsnit);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fejl: Kunne ikke finde filen " + filNavn);
        } catch (NumberFormatException e) {
            System.out.println("Fejl: Kunne ikke læse tallet korrekt fra filen.");
        }
    }
}
