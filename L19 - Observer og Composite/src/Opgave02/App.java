package Opgave02;

public class App {
    public static void main(String[] args) {
        Rektangel rektangel1 = new Rektangel("Rekt1", 1, 5);
        Rektangel rektangel2 = new Rektangel("Rekt2", 20, 12);

        Trekant trekant1 = new Trekant("Trek1", 10, 2);

        Ellipse ellipse1 = new Ellipse("Elli1", 3, 4);
        Ellipse ellipse2 = new Ellipse("Elli2", 7, 6);

        Tegning tegning = new Tegning("TegningTest");

        tegning.tilføjFigur(rektangel1);
        tegning.tilføjFigur(rektangel2);
        tegning.tilføjFigur(trekant1);
        tegning.tilføjFigur(ellipse1);
        tegning.tilføjFigur(ellipse2);


        tegning.tegn();
        System.out.println(tegning.getAreal());


        Tegning tegning1 = new Tegning("TegningDerHolderTegning");

        Ellipse ellipse3 = new Ellipse("Elli3", 3, 4);
        Ellipse ellipse4 = new Ellipse("Elli4", 7, 6);

        tegning1.tilføjFigur(ellipse3);
        tegning1.tilføjFigur(ellipse4);

        tegning1.tegn();
        System.out.println(tegning1.getAreal());

        tegning1.tilføjFigur(tegning);

        tegning1.tegn();
        System.out.println(tegning1.getAreal());

    }
}
