package Opgave01;

import java.util.ArrayList;
import java.util.List;

public class BogTitel implements Subject{

    private String titel;
    private int antal;

    private List<Kunde> kunder;
    private List<Observer> observers;

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        this.kunder = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }


    /*
    Associeringen mellem den aktuelle bogtitel og kunden k er opdateret, bogens antal er
    reduceret med en og alle observers skal have information om, at bogen er solgt
     */
    public void etKoeb(Kunde kunde) {
        if(!this.kunder.contains(kunde)) {
            this.kunder.add(kunde);
            kunde.addBogTitler(this);
            antal--;
            notifyObservers();
        }
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    @Override
    public void addObserver(Observer observer) {
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Kunde> getKunder() {
        return kunder;
    }

    private void notifyObservers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }
}
