package Opgave03;

import java.util.Random;

public class CircularCannibalMeal {

    private Person lastEaten; // Holder styr på placeringen efter et måltid
    private int size;
    private Person head;
    private Person tail;

    public CircularCannibalMeal() {
        this.lastEaten = null;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }


    // Adds person to the cannibal dance meal
    public void addPerson(Person p) {
        if (head == null) {
            head = p;
            tail = p;
            p.next = head; // Cirkulær reference til sig selv
        } else {
            tail.next = p;
            tail = p;
            tail.next = head; // Lukker cirklen
        }
        size++;
    }



    // Removes random person from the cannibal dance
    // Fjerner og returnerer en tilfældig person (bruges kun første gang)
    public Person eatRandomPerson() {
        if (size == 0) return null;

        Random rand = new Random();
        int randomIndex = rand.nextInt(size);

        // Vi tæller frem til den tilfældige person
        // count = randomIndex + 1 for at bruge den eksisterende logik
        return eatNextPerson(randomIndex + 1);
    }



    // Removes person "count" places from the last eaten
    public Person eatNextPerson(int count) {
        if (size == 0) return null;

        // Vi skal finde personen LIGE FØR den, der skal spises
        Person prev = null;
        Person current = null;

        // Hvis det er første gang (eller efter eatRandomPerson), starter vi fra head
        if (lastEaten == null) {
            current = head;
            // Find den præcederende node for head
            prev = tail;
        } else {
            // Vi starter fra den person, der stod EFTER den sidst spiste
            current = lastEaten.next;
            // Find prev til current
            prev = lastEaten;

        }
        // Tæl 'count' gange frem
        for (int i = 1; i < count; i++) {
                 prev = current;
                current = current.next;
        }

        // Nu er 'current' personen, der skal spises, og 'prev' er personen før.

        // Opdater strukturen
        if (size == 1) {
            head = null;
            tail = null;
            lastEaten = null;
        } else {
            prev.next = current.next;

            if (current == head) {
                head = current.next;
            }
            if (current == tail) {
                tail = prev;
            }
            // Den næste tælling skal starte baseret på positionen FØR den spiste
            lastEaten = prev;
        }
        size--;
        return current;
    }





    public void printPersons() {
        if (size == 0) {
            System.out.println("Cirklen er tom.");
            return;
        }
        Person current = head;
        do {
            System.out.print(current.getName() + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(tilbage til start)");
    }// Prints all persons waiting to be served




    public int getSize() {
        return size;
    }
}
