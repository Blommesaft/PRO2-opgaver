package Opgave03;

public class Mekaniker extends Ansat {

    private int årForSvendeprøve;

    public Mekaniker(String navn, String adresse, int årForSvendeprøve, double timelønssats) {
        super(navn, adresse, timelønssats);
        this.årForSvendeprøve = årForSvendeprøve;
    }

    public int getÅrForSvendeprøve() {
        return årForSvendeprøve;
    }

    public void setÅrForSvendeprøve(int årForSvendeprøve) {
        this.årForSvendeprøve = årForSvendeprøve;
    }

    public double beregnLoen() {
        double loen = 0;

        loen = this.getTimelønssats() * 37;

        return loen;
    }
}
