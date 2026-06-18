package opgaver;

public class Opgave3 {
    public static void main(String[] args) {

        System.out.println(product(19, 3));
        System.out.println(productRus(19,3));
    }

    public static int product(int a, int b) {
        int result = 0;

        if(a==0) {
            return 0;
        }

        result = product(a-1, b) + b;

        return result;
    }

    public static int productRus(int a, int b) {
        int result = 0;

        if(a==0) {
            return 0;
        }

        if(a%2!=0) {
            result = productRus(a-1, b) + b;
        }

        if(a%2==0) {
            result = productRus(a/2 , b*2);
        }

        return result;
    }
}
