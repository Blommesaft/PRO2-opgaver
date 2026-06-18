package opgaver;

public class Opgave6 {
    public static void main(String[] args) {

        System.out.println(dominobrik(-1));
        System.out.println(dominobrik(0));
        System.out.println(dominobrik(1));
        System.out.println(dominobrik(2));
        System.out.println(dominobrik(3));

    }

    public static int dominobrik(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return n;
        }
        return dominobrik(n - 1) + dominobrik(n - 2);
    }
}
