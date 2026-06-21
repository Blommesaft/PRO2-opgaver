package Opgave04;

public class Rektangel extends Figur{

    private int s1;
    private int s2;

    public Rektangel(int y, int x, int s1, int s2) {
        super(y, x);
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public double areal() {
        return s1 * s2;
    }

    @Override
    public void udskrivTilstand() {
        System.out.println("Rektnagel");
    }
}
