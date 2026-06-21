package Opgave05;

public class App {
    public static void main(String[] args) {
        // Opretter indkøbsvogn
        Indkøbsvogn vogn = new Indkøbsvogn();

        // Opretter testdata (Varer)
        Vare mælk = new Fødevare(12, "Øko Mælk", "1 Liter letmælk", 6);
        Vare pære = new ElArtikel(8,"LED Pære", "Energivenlig pære",  5); // Lav pris, tester "mindst 3 kr moms"
        Vare brødrister = new ElArtikel(200,"Brødrister", "Flot i stål",  8); // Normal el-moms (30%)
        Vare billigSnaps = new Spiritus(50,"Aalborg Basis", "Lille flaske",  38.0); // Under 90 kr (80% moms)
        Vare dyrWhisky = new Spiritus(350,"Single Malt Whisky", "12 år gammel",  43.0); // Over 90 kr (120% moms)
        Vare tShirt = new AndreVarer(100, "Sort T-shirt", "100% bomuld"); // Almindelig vare (25% moms)

        // Lægger varer i vognen
        vogn.addVare(mælk);
        vogn.addVare(pære);
        vogn.addVare(brødrister);
        vogn.addVare(billigSnaps);
        vogn.addVare(dyrWhisky);
        vogn.addVare(tShirt);

        vogn.kassebon();

        System.out.println("------------------------------------------");
        System.out.printf("%-31s %.2f kr.\n", "TOTAL AT BETALE:", vogn.salgspris());
        System.out.println("==========================================");
    }
}