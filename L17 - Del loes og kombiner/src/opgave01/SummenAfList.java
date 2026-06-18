package opgave01;

import java.util.ArrayList;

public class SummenAfList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int index = 0; index < 30; index++) {
            if (index % 2 == 0) {
                list.add(index);
            }
        }

        System.out.println(sum(list, 0, list.size()-1));
    }

    private static int sum(ArrayList<Integer> list, int i, int h) {

        if (h == i) {
            return list.get(i);
        } else {
            int m = (i + h) / 2;
            int sum1 = sum(list, i, m);
            int sum2 = sum(list, m+1, h);

            return sum1+sum2;
        }
    }
}
