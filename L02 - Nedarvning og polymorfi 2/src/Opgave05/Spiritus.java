package Opgave05;

public class Spiritus extends Vare{

    private double alkoholProcent;

    public Spiritus(int pris, String navn, String beskrivelse, double alkoholProcent) {
        super(pris, navn, beskrivelse);
        this.alkoholProcent = alkoholProcent;
    }

    @Override
    public double salgsPris() {

        // 80% moms = 180% af originalpris
        double moms = (80 / 100.0) + 1;
        double originalPris = this.getPris();

        // 120% hvis netto over 90kr
        if (moms * originalPris > 90) {
            moms = (120 / 100.0) +1;
        }

        return originalPris * moms;
    }




}
