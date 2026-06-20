package opgave02;

import java.util.ArrayList;

public class AntalletAf0IList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int index = 0; index < 30; index++) {
            if (index % 2 == 0) {
                list.add(index);
            }
        }

        System.out.println(antalletAf0(list, 0, list.size()-1));
    }

    private static int antalletAf0(ArrayList<Integer> list, int i, int h) {

        if (h == i) {
            if(list.get(i) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (i + h) / 2;
            int sum1 = antalletAf0(list, i, m);
            int sum2 = antalletAf0(list, m+1, h);

            return sum1+sum2;
        }
    }
}
