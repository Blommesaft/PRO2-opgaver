package Opgave01;

import java.util.ArrayList;
import java.util.List;

public class Saelger implements Observer{

    private String navn;

    public Saelger(String navn) {
        this.navn = navn;
    }

    /* Der er udskrevet en liste på skærmen med titlen på de bøger, der er købt af andre
    kunder, der også har købt den netop solgte bog s. Listen må ikke indeholde den
    samme titel flere gange. Endvidere skal listen ikke indeholde titlen på den aktuelle bog.
     */
    @Override
    public void update(Subject subject) {
        BogTitel bog = (BogTitel) subject;
        List<String> andreTitler = new ArrayList<>();

        for (Kunde k : bog.getKunder()) {
            for(BogTitel andenbog : k.getBogTitler()) {
                String titel = andenbog.getTitel();
                if (!titel.equals(bog.getTitel()) && !andreTitler.contains(titel)) {
                    andreTitler.add(titel);
                }
            }
        }
        for (String s : andreTitler) {
            System.out.println(s);
        }
    }
}
