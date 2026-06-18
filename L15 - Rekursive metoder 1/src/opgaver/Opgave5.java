package opgaver;

public class Opgave5 {
    public static void main(String[] args) {
        System.out.println(Euclid(24, 48));
        System.out.println(Euclid(28, 35));
        System.out.println(Euclid(49, 7));

    }

    public static int Euclid(int a, int b) {
        if(b<=a && a%b==0) {
            return b;
        }
        int result = 0;
        if (a < b) {
           result = Euclid(b,a);
        } else {
           result = Euclid(b, a%b);
        }
        return result;
    }
}
