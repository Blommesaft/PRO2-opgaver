package Opgave02;

import java.util.ArrayList;
import java.util.List;

public class Tegning extends Figur{
    private List<Figur> figurer = new ArrayList<>();

    public Tegning(String navn) {
        super(navn);
    }

    public void tilføjFigur(Figur figur) {
        if (!figurer.contains(figur)) {
            figurer.add(figur);
        }
    }

    public void fjernFigur(Figur figur) {
        figurer.remove(figur);
    }



    @Override
    public void tegn() {
        for (Figur f : figurer) {
            // I stedet for at printe navnet direkte her, lader vi figuren selv bestemme, hvordan den tegnes
            f.tegn();
        }
    }

    @Override
    public double getAreal() {
        double areal = 0;
        for (Figur f : figurer) {
            areal += f.getAreal();
        }
        return areal;
    }
}
