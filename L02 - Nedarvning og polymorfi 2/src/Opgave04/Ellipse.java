package Opgave04;

public class Ellipse extends Figur{

    private int r1;
    private int r2;

    public Ellipse(int y, int x, int r1, int r2) {
        super(y, x);
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double areal() {
        return Math.PI * r1 * r2;
    }

    @Override
    public void udskrivTilstand() {
        System.out.println("Ellipse");
    }
}
