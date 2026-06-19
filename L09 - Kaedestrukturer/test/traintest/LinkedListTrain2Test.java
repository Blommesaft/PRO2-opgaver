package traintest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import train.LinkedListTrain2;
import train.WagonNode;

class LinkedListTrain2Test
{
    private WagonNode locomotive;

    private WagonNode wagon1;
    private WagonNode wagon2;
    private WagonNode wagon3;
    private WagonNode wagon4;
    private WagonNode wagon5;

    @BeforeEach
    void setUp() throws Exception
    {
        this.locomotive = new WagonNode("Locomotive");

        this.wagon1 = new WagonNode("Passenger carriage");
        this.wagon2 = new WagonNode("Platform wagon");
        this.wagon3 = new WagonNode("Centerbeam");
        this.wagon4 = new WagonNode("Autorack");
        this.wagon5 = new WagonNode("Hopper");
    }

    @Test
    @Order(1)
    void test_linkedListTrain2_canAddLastWagon()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain2 train = new LinkedListTrain2();

        // --------------------------------------------------
        // ACT
        // --------------------------------------------------

        train.addLast(wagon5);
        train.addLast(wagon4);
        train.addLast(wagon3);
        train.addLast(wagon2);
        train.addLast(wagon1);
        train.addLast(locomotive);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        WagonNode wagonSelected = train.getLast();
        assertEquals(locomotive, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon1, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon2, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon3, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon4, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon5, wagonSelected);
    }
}