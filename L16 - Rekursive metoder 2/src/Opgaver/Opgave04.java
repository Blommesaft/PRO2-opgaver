package Opgaver;

public class Opgave04 {

    private static int antalFlytninger = 0;

    public static void flyt(int n, int fra, int til){
        if (n==1) {
            antalFlytninger++;
            System.out.println("Flyt 1 fra " +fra +" til " + til + " nr " + antalFlytninger);


        }
        else {
            int temp = 6 - fra - til;

            flyt(n-1,fra,temp);

            antalFlytninger++;
            System.out.println("Flyt " + n + " fra " + fra +" til " + til + " nr " + antalFlytninger);

            flyt(n-1,temp,til);
        }
    }
    public static void main(String[] args) {
        flyt(4,1,3);

        System.out.println(antalFlytninger);

    }

}
