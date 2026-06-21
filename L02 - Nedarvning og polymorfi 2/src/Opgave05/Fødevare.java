package Opgave05;

public class Fødevare extends Vare{

    private int holdbarhedsperiode;

    public Fødevare(int pris, String navn, String beskrivelse, int holdbarhedsperiode) {
        super(pris, navn, beskrivelse);
        this.holdbarhedsperiode = holdbarhedsperiode;
    }

    @Override
    public double salgsPris() {

        // 5% moms = 105% af originalpris
        double moms = (5 / 100.0) + 1;
        double originalPris = this.getPris();

        return originalPris * moms;
    }
}
