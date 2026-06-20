package snackssupply;

import java.util.ArrayList;
import java.util.Collections;

public class SnackBar
{
    // TODO: Implement sortSnacks(E[] snackContainer)
    // E skal udvide Comparable for at vi kan sortere dem
    public static <E extends Comparable<E>> void sortSnacks(ArrayList<E> snackContainer)
    {
        Collections.sort(snackContainer);
    }
}
