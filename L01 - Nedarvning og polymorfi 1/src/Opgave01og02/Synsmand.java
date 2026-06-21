package Opgave01og02;

public class Synsmand extends Mekaniker {

    private int ugentligSyn;

    public Synsmand(String navn, String adresse, int årForSvendeprøve, double timelønssats, int ugentligSyn) {
        super(navn, adresse, årForSvendeprøve, timelønssats);
        this.ugentligSyn = ugentligSyn;
    }

    @Override
    public double beregnLoen() {
        return super.beregnLoen() + (this.ugentligSyn * 29);
    }
}
