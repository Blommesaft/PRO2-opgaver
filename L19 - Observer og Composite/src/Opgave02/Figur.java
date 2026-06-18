package Opgave02;

public abstract class Figur {

    private String navn;

    public Figur (String navn) {
        this.navn = navn;
    }

    public abstract void tegn();
    public abstract double getAreal();

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
}
