package Opgave04;

public class Cirkel extends Figur{

    private int r;

    public Cirkel(int y, int x, int r) {
        super(y, x);
        this.r = r;
    }


    @Override
    public double areal() {
        return Math.PI * r * r;
    }

    @Override
    public void udskrivTilstand() {
        System.out.println("Cirkel");
    }
}
