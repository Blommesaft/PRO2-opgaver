package opgaver;

public class Opgave4 {
    public static void main(String[] args) {

        System.out.println(reverse("FARTS"));
    }

    public static String reverse(String s) {
        /*
        reverse FARTS
        (ARTS) + F
        ((RTS) + A) + F
        (((TS) + R) + A) + F
        ((((S) + T) + R) + A) + F
        S + T + R + A + F
         */

        if(s.isEmpty()) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }
}
