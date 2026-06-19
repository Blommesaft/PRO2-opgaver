package opgave5forbedring;

import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {
    private ArrayList<String> listString = new ArrayList<>();
    private ArrayList<Integer> listInteger = new ArrayList<>();

    public ArrayList<Integer> readValues() {
        System.out.println("Indtast nogle positive tal. Og en overskrift før hver tal. "
                + "Indtast et negativt tal for at afslutte: ");

        Scanner in = new Scanner(System.in);

        String overskrift = in.next();
        int n = in.nextInt();
        while (n >= 0) {
            listString.add(overskrift);
            listInteger.add(n);
            overskrift = in.next();
            n = in.nextInt();
        }
        return listInteger;
    }

    /**
     * Finds and returns the max value in the list.
     *
     * @param list
     *            the list with values.
     * @return the max value found.
     */
    public int findMax(ArrayList<Integer> list) {
        // TODO: find max in list
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i > max)
                max = i;
        }
        return max;
    }

    /**
     * Prints out a BarChart of the values using the System.out.println method.
     */
    public void printBarChart() {
        int max = findMax(this.listInteger);

        // TODO: print out bar chart
        for (int i = 0; i < listInteger.size(); i++) {
            double relativStørrelse = (double) listInteger.get(i) / max;

            System.out.print(listString.get(i) + "   ");

            for (int index = 0; index < 40 * relativStørrelse; index++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
