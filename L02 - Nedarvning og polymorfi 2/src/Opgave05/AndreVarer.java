package Opgave05;

public class AndreVarer extends Vare{


    public AndreVarer(int pris, String navn, String beskrivelse) {
        super(pris, navn, beskrivelse);
    }

    @Override
    public double salgsPris() {

        // 25% moms = 125% af originalpris
        double moms = (25 / 100.0) + 1;
        double originalPris = this.getPris();

        return originalPris * moms;
    }
}
