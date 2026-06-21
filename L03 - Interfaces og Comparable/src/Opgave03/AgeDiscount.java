package Opgave03;

import java.time.LocalDate;

public class AgeDiscount implements Discount {

    private int fødselsår;

    public AgeDiscount(int fødselsår) {
        this.fødselsår = fødselsår;
    }

    @Override
    public double getDiscount(double price) {

        int kundealder = LocalDate.now().getYear() - fødselsår;

        return price * (kundealder / 100.0);
    }
}
