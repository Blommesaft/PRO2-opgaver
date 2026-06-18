package Opgave01;

import java.util.ArrayList;
import java.util.List;

public class Kunde {

    private String navn;

    private List<BogTitel> bogTitler;

    public Kunde(String navn) {
        this.navn = navn;
        this.bogTitler = new ArrayList<>();
    }

    public List<BogTitel> getBogTitler() {
        return new ArrayList<>(bogTitler);
    }

    public void addBogTitler(BogTitel bogTitel) {
        if(!bogTitler.contains(bogTitel)) {
            this.bogTitler.add(bogTitel);
            bogTitel.etKoeb(this);
        }
    }

}
