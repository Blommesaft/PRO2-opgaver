package Opgaver;

public class Opgave05 {
    public static void main(String[] args) {
        System.out.println(talN(3));
        System.out.println(talNIterativ(3));

    }


    public static int talN (int n) {
        int result = 0;

        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 5;
        }
        if (n%2 == 0) {
            result = (2 * talN(n-3)) - talN(n-1);
        } else {
            result = talN(n-1) + talN(n-2) + (3*talN(n-3));
        }


        return result;
    }

    public static int talNIterativ (int n) {

        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 5;
        }

        int t0 = 2;   // t(0)
        int t1 = 1;   // t(1)
        int t2 = 5;   // t(2)
        int result = 0;

        for (int i = 3; i <= n; i++) {

            if (i % 2 == 0) {
                result = 2 * t0 - t2;
            } else {
                result = t2 + t1 + 3 * t0;
            }

            // Flyt værdierne et skridt frem
            t0 = t1;
            t1 = t2;
            t2 = result;
        }

        return result;
    }
}
