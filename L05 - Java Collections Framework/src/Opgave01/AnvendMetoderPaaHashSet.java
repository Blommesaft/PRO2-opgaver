package Opgave01;

import java.util.HashSet;
import java.util.Set;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {

        // 1) Erklæring og oprettelse af en mængde baseret på et HashSet
        Set<Integer> maengde = new HashSet<>();

        // 2) Tilføj tallene
        maengde.add(34);
        maengde.add(12);
        maengde.add(23);
        maengde.add(45);
        maengde.add(67);
        maengde.add(34);
        maengde.add(98);

        // 3) Udskriv
        System.out.println(maengde);

        // 4) Indsæt 23
        maengde.add(23);

        // 5) Udskriv
        System.out.println(maengde);

        // 6) Fjern 67
        maengde.remove(67);

        // 7) Udskriv
        System.out.println(maengde);

        // 8) Undersøg om mængde indeholder elementet 23
        if (maengde.contains(23))
            System.out.println("Indeholder 23");

        // 9) Udskriv antal elementer i mængden
        System.out.println(maengde.size());
    }
}
