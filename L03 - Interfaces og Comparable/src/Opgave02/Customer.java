package Opgave02;

public class Customer implements Comparable<Customer>{
    private String fornavn;
    private String efternavn;
    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }
    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getAlder() {
        return alder;
    }
    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer p) {
        int comp = this.efternavn.compareTo(p.getEfternavn());
        if (comp == 0) {
            comp = this.fornavn.compareTo(p.getFornavn());
        }
        if (comp == 0) {
            comp = this.alder - p.getAlder();
        }

        /*
        int comp = this.efternavn.compareTo(p.getEfternavn());
        if (comp != 0) {
            return comp;
        } else if (comp == 0) {
            comp = this.fornavn.compareTo(p.getFornavn());
            if (comp != 0) {
                return comp;
            }
        } else {
            comp = this.alder - p.getAlder();
        }
         */

        return comp;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", alder=" + alder +
                '}';
    }
}
