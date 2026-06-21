package Opgave04;

public class Kvadrat extends Figur{

    private int s;

    public Kvadrat(int y, int x, int s) {
        super(y, x);
        this.s = s;
    }


    @Override
    public double areal() {
        return s * s;
    }

    @Override
    public void udskrivTilstand() {
        System.out.println("Kvadrat");
    }
}
