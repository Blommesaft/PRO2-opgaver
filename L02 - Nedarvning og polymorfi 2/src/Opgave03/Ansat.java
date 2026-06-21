package Opgave03;

public abstract class Ansat extends Person {

    private double timelønssats;

    public Ansat(String navn, String adresse, double timelønssats) {
        super(navn, adresse);
        this.timelønssats = timelønssats;
    }

    public double getTimelønssats() {
        return timelønssats;
    }

    public abstract double beregnLoen();
}
