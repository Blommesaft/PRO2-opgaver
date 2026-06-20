package snackssupply;

import snacks.Limb;

import java.util.function.Supplier;

public class SnackFactory
{
    // TODO: Implement getNewSnacks(E[] snackContainer)
    public static <E> void getNewSnacks(E[] snackContainer)
    {

        try
        {
            for (int i = 0; i < snackContainer.length; i++)
            {
                snackContainer[i] =
                        (E) snackContainer.getClass()
                                .getComponentType()
                                .getDeclaredConstructor()
                                .newInstance();
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public static <E> void getNewSnacks(E[] snackContainer, Supplier<E> supplier)
    {
        for (int i = 0; i < snackContainer.length; i++)
        {
            snackContainer[i] = supplier.get();
        }
    }
}
