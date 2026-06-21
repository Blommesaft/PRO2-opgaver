package Opgave03;

import Opgave03.Mekaniker;

public class Værkfører extends Ansat {

    private int årForUdnævnelse;
    private double ugentligTillæg;

    public Værkfører(String navn, String adresse, double timelønssats, double ugentligTillæg, int årForUdnævnelse) {
        super(navn, adresse, timelønssats);
        this.ugentligTillæg = ugentligTillæg;
        this.årForUdnævnelse = årForUdnævnelse;
    }

    @Override
    public double beregnLoen() {
        return (this.getTimelønssats() * 37) + this.ugentligTillæg;
    }
}
