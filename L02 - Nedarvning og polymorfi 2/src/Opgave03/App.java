package Opgave03;

import Opgave03.Mekaniker;
import Opgave03.Synsmand;
import Opgave03.Værkfører;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Ansat> list = new ArrayList<>(List.of(
                new Mekaniker("1", "1", 1, 100),
                new Mekaniker("2", "2", 1, 100),
                new Mekaniker("3", "3", 1, 100),
                new Mekaniker("4", "4", 1, 100),
                new Værkfører("1", "5", 100, 100, 1),
                new Værkfører("2", "6", 100, 100, 1),
                new Værkfører("3", "7", 100, 100, 1),
                new Værkfører("4", "8", 100, 100, 1),
                new Synsmand("1", "1", 1, 100, 1),
                new Synsmand("2", "1", 1, 100, 2),
                new Synsmand("3", "1", 1, 100, 3),
                new Synsmand("4", "1", 1, 100, 4),
                new Arbejdsdreng("1", "1", 100),
                new Arbejdsdreng("2", "1", 100),
                new Arbejdsdreng("3", "1", 100),
                new Arbejdsdreng("4", "1", 100)
        ));

        System.out.println(samletUgeLoen(list));


    }

    public static double samletUgeLoen(ArrayList<Ansat> list) {
        double samlet = 0;

        for (Ansat a : list) {
            samlet += a.beregnLoen();
        }

        return samlet;
    }
}
