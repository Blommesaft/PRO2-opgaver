package Opgave01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Chili[] chilier = new Chili[3];
        chilier[0] = new Chili("Stærk", 100000);
        chilier[1] = new Chili("Mild", 10000);
        chilier[2] = new Chili("Nem", 1000);


        System.out.println(max(chilier));
        System.out.println(avg(chilier));
    }

    public static Measurable max(Measurable[] objects) {
        Measurable max = objects[0];

        for (Measurable o : objects) {
            if (o.getMeasure() > max.getMeasure()) {
                max = o;
            }
        }
        return max;
    }


    public static double avg(Measurable[] objects) {
        double sum = 0;

        for (Measurable o: objects) {
            sum += o.getMeasure();
        }

        return sum / objects.length;
    }
}
