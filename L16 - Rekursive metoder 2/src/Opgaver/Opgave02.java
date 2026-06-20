package Opgaver;

public class Opgave02 {
    public static void main(String[] args) {




    }






    public static boolean palindrom(String tekst) {
        return tekst.length() == 1 || palindrom(tekst, 0);
    }

    private static boolean palindrom(String tekst, int index) {
        if (index > tekst.length() / 2 ) {
            return true;
        }
        if (tekst.charAt(index) != tekst.charAt(tekst.length() - 1 - index)) {
            return false;
        }
        return palindrom(tekst, index+1);
    }
}
