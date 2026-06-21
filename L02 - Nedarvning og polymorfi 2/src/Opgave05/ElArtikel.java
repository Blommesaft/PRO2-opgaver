package Opgave05;

public class ElArtikel extends Vare {

    private int forbrugPrTime;

    public ElArtikel(int pris, String navn, String beskrivelse, int forbrugPrTime) {
        super(pris, navn, beskrivelse);
        this.forbrugPrTime = forbrugPrTime;
    }

    @Override
    public double salgsPris() {

        // 30% moms = 130% af originalpris
        double moms = (30 / 100.0) + 1;
        double originalPris = this.getPris();

        // mindst 3 kr
        if ((moms * originalPris) - originalPris < 3) {
            return originalPris + 3;
        }

        return originalPris * moms;
    }
}
