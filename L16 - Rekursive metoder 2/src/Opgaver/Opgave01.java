package Opgaver;

import java.util.ArrayList;

public class Opgave01 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(10); liste.add(9); liste.add(2); liste.add(3); liste.add(12);

        System.out.println(ligeTalHjulpet(liste));
        System.out.println(ligeTal(liste));



    }

    public static int ligeTalHjulpet(ArrayList<Integer> list) {
        return ligeTalHjaelp(list, 0);
    }

    private static int ligeTalHjaelp(ArrayList<Integer> list, int index) {
        int result = 0;
        if (index == list.size()) {
            result = 0;
        } else {
            if (list.get(index) % 2 == 0) {
                result++;
            }
            result += ligeTalHjaelp(list, index + 1);
        }

        return result;
    }



    public static int ligeTal(ArrayList<Integer> list) {
        int result = 0;
        if (list.size() == 0) {
            result = 0;
        } else {
            if (list.get(0) % 2 == 0) {
                result++;
            }
            list.remove(0);
            result += ligeTal(list);
        }


        return result;
    }
}
