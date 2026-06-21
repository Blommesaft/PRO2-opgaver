package Opgave01og02;

public class Værkfører extends Mekaniker {

    private int årForUdnævnelse;
    private double ugentligTillæg;

    public Værkfører(String navn, String adresse, int årForSvendeprøve, double timelønssats, int årForUdnævnelse, double ugentligTillæg) {
        super(navn, adresse, årForSvendeprøve, timelønssats);
        this.årForUdnævnelse = årForUdnævnelse;
        this.ugentligTillæg = ugentligTillæg;
    }

    @Override
    public double beregnLoen() {
        return super.beregnLoen() + this.ugentligTillæg;
    }
}
