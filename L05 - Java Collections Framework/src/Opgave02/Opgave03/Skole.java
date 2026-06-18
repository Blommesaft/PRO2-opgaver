package Opgave02.Opgave03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skole {
    private String navn;
    private HashMap<Integer, Studerende> studerende;

    public Skole(String navn) {
        this.navn = navn;
        this.studerende = new HashMap<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende s) {
        if (!studerende.containsKey(s.getStudieNr())) {
            studerende.put(s.getStudieNr(), s);
        }
    }

    public void removeStuderende(Studerende s) {
        studerende.remove(s.getStudieNr());
    }

    public double gennemsnit() {
        double samlet = 0;
        double antal = 0;

        for (Map.Entry<Integer, Studerende> entry : studerende.entrySet()) {
            Studerende v = entry.getValue();
            List<Integer> karakterer = v.getKarakterer();
            for (int index = 0; index < karakterer.size(); index++) {
                samlet += karakterer.get(index);
                antal++;
            }
        }

        return samlet / antal;
    }

    public Studerende findStuderende(int studieNr) {
        for (Map.Entry<Integer, Studerende> entry : studerende.entrySet()) {
            int k = entry.getKey();
            Studerende v = entry.getValue();
            if (k == studieNr) {
                return v;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                ", studerende=" + studerende +
                '}';
    }
}
