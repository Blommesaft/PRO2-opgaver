package opgaver;

public class Opgave1 {
    public static void main(String[] args) {

        System.out.println(factorial(3));
    }

    public static int factorial(int n) {
        int result = 0;

        if (n==0) {
            return 1;
        }
        result = n * factorial(n-1);

        return result;
    }
}
