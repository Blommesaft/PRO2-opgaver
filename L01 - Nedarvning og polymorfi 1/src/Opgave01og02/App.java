package Opgave01og02;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Mekaniker> list = new ArrayList<>();
        list.addAll(List.of(
                new Mekaniker("1", "1", 1, 100),
                new Mekaniker("2", "2", 1, 100),
                new Mekaniker("3", "3", 1, 100),
                new Mekaniker("4", "4", 1, 100),
                new Værkfører("5", "5", 1, 100, 1, 100),
                new Værkfører("6", "6", 1, 100, 1, 100),
                new Værkfører("7", "7", 1, 100, 1, 100),
                new Værkfører("8", "8", 1, 100, 1, 100),
                new Synsmand("1", "1", 1, 100, 1),
                new Synsmand("1", "1", 1, 100, 2),
                new Synsmand("1", "1", 1, 100, 3),
                new Synsmand("1", "1", 1, 100, 4)
        ));

        System.out.println(samletLoen(list));


    }

    public static double samletLoen(ArrayList<Mekaniker> list) {
        int samlet = 0;

        for (Mekaniker m : list) {
            samlet += m.beregnLoen();
        }

        return samlet;
    }
}
