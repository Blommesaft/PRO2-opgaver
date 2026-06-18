package Opgave02;

public class Rektangel extends Figur{

    private double længde;
    private double bredde;

    public Rektangel(String navn, double længde, double bredde) {
        super(navn);
        this.længde = længde;
        this.bredde = bredde;
    }

    @Override
    public void tegn() {
        System.out.println(getNavn());
    }

    @Override
    public double getAreal() {
        return længde*bredde;
    }
}
