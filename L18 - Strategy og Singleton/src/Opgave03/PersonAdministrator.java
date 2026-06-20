package Opgave03;

import java.util.HashSet;
import java.util.Set;

public class PersonAdministrator {

    // 1. Den eneste instans af klassen (bliver først oprettet når der er brug for den)
    private static PersonAdministrator instance;

    // Sættet til at holde personerne
    private Set<Person> personer;

    // 2. Privat konstruktør forhindrer brug af 'new' udefra
    private PersonAdministrator() {
        personer = new HashSet<>();
    }

    // 3. Globalt adgangspunkt til instansen
    public static PersonAdministrator getInstance() {
        if (instance == null) {
            instance = new PersonAdministrator();
        }
        return instance;
    }

    // Metode til at tilføje en person
    public void add(Person person) {
        personer.add(person);
    }

    // Metode til at hente alle personer
    public Set<Person> getPersoner() {
        return personer;
    }

    // Metode til at fjerne en person
    public void remove(Person person) {
        personer.remove(person);
    }
}
