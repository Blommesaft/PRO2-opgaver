package Opgave05;

import java.util.ArrayList;

public class Indkøbsvogn {

    private ArrayList<Vare> varer = new ArrayList<>();

    public Indkøbsvogn() {
        this.varer = new ArrayList<>();
    }

    public void addVare(Vare vare) {
        this.varer.add(vare);
    }

    public double salgspris() {
        double sum = 0;

        for (Vare v: varer) {
            sum += v.salgsPris();
        }

        return sum;
    }

    public void kassebon() {
        for (Vare v: varer) {
            System.out.println(v.getNavn() + ": " + v.getPris());
        }
    }

}
