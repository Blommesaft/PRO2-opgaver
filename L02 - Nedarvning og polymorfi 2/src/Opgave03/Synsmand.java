package Opgave03;

import Opgave03.Mekaniker;

public class Synsmand extends Mekaniker {

    private int ugentligSyn;

    public Synsmand(String navn, String adresse, int årForSvendeprøve, double timelønssats, int ugentligSyn) {
        super(navn, adresse, årForSvendeprøve, timelønssats);
        this.ugentligSyn = ugentligSyn;
    }

    @Override
    public double beregnLoen() {

        double basisLoen = getTimelønssats() * 37;
        double synsBonus = this.ugentligSyn * 29;

        return basisLoen + synsBonus;
    }
}
