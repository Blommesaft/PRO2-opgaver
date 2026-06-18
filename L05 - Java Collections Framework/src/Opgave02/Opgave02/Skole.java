package Opgave02.Opgave02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Skole {
    private String navn;
    private HashSet<Studerende> studerende;

    public Skole(String navn) {
        this.navn = navn;
        this.studerende = new HashSet<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende s) {
            studerende.add(s);
    }

    public void removeStuderende(Studerende s) {
        studerende.remove(s);
    }

    public double gennemsnit() {
        double samlet = 0;
        double antal = 0;

        for (Studerende s : studerende) {
            List<Integer> karakterer = s.getKarakterer();
            for (int index = 0; index < karakterer.size(); index++) {
                samlet += karakterer.get(index);
                antal++;
            }
        }
        return samlet / antal;
    }

    public Studerende findStuderende(int studieNr) {
        for (Studerende s : studerende) {
            if (s.getStudieNr() == studieNr) {
                return s;
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
