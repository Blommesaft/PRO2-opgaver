package Opgave01;

public class Indkoeber implements Observer{

    private String navn;

    public Indkoeber(String navn) {
        this.navn = navn;
    }

    /*Hvis der er mindre end 6 bøger tilbage af bogtitelen s, udskrives på skærmen, at der
    skal bestilles 10 bøger med den pågældende titel. Endvidere registreres med det
    samme at der er købt 10 bøger til lageret.
     */
    @Override
    public void update(Subject subject) {
     if(subject instanceof BogTitel) {
         BogTitel bog = (BogTitel) subject;

         if(bog.getAntal() <= 5) {
             System.out.println(bog.getTitel() + " har under 6 eksemplarer, køb 10 mere");
             bog.indkoebTilLager(10);
         }
     }
    }
}
