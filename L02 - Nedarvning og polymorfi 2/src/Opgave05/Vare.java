package Opgave05;

public abstract class Vare {

    private int pris;
    private String navn;
    private String beskrivelse;

    public Vare(int pris, String navn, String beskrivelse) {
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }



    public int getPris() {
        return pris;
    }
    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }
    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }



    public abstract double salgsPris();
}
