package Opgaver;

public class Opgave03 {
    public static void main(String[] args) {

    }


    public static boolean findesTalIArray(int[] array, int tal) {
        return findesTalIArrayHelper(array, tal, 0);
    }

    private static boolean findesTalIArrayHelper(int[] array, int tal, int index) {
        if (index >= array.length) {
                return false;
        }

        if (array[index] == tal) {
            return true;
        }

        return findesTalIArrayHelper(array, tal,index+1);
    }
}
