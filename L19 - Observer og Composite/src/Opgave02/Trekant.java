package Opgave02;

public class Trekant extends Figur{

    private double højde;
    private double grundlinje;

    public Trekant (String navn, double højde, double grundlinje) {
        super(navn);
        this.højde = højde;
        this.grundlinje = grundlinje;
    }


    @Override
    public void tegn() {
        System.out.println(getNavn());
    }

    @Override
    public double getAreal() {
        return højde*grundlinje*0.5;
    }
}
