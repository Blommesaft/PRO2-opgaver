package opgaver;

public class Opgave2 {
    public static void main(String[] args) {

        System.out.println(power2(2,6));

    }

    public static int power(int n, int p) {
        int result = 0;

        if(p==0) {
            return 1;
        }

        result = power(n, p-1) * n;

        return result;
    }

    public static int power2(int n, int p) {
        int result = 0;

        if(p==0) {
            return 1;
        }

        if(p%2!=0) {
            result = power2(n, p-1) * n;
        }

        if(p%2==0) {
            result = power2(n*n, p/2);
        }

        return result;
  }
}
