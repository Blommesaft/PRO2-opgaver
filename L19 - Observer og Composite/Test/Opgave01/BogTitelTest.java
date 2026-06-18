package Opgave01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BogTitelTest {

    @Test
    void etKoeb_automatiskIndkoeb() {

        // OBS: Bemærk specifikation af Indkoeber

        // Arrange
        BogTitel bogTitel = new BogTitel("Pas", 6);
        Kunde kunde = new Kunde("Svensker");
        Indkoeber indkoeber = new Indkoeber("Finansmand");
        bogTitel.addObserver(indkoeber);

        // Act
        bogTitel.etKoeb(kunde);

        // Assert
        assertEquals(15, bogTitel.getAntal());
    }

    @Test
    void simulationTing() {

        // 1. Opsætning til at læse konsol-output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Gem den originale strøm
        System.setOut(new PrintStream(outContent));

        try {


        // Arrange
        Saelger saelger = new Saelger("Hansen");
        Indkoeber indkoeber = new Indkoeber("Jensen");
        BogTitel bogTitel1 = new BogTitel("Anders And", 6);
        bogTitel1.addObserver(indkoeber);
        bogTitel1.addObserver(saelger);
        BogTitel bogTitel2 = new BogTitel("Java", 8);
        bogTitel2.addObserver(indkoeber);
        Kunde kunde1 = new Kunde("Læsehest1");
        Kunde kunde2 = new Kunde("Læsehest2");
        Kunde kunde3 = new Kunde("Læsehest3");

        // Act 1
        bogTitel2.etKoeb(kunde1);
        bogTitel2.etKoeb(kunde2);
        bogTitel2.etKoeb(kunde3);
        bogTitel1.etKoeb(kunde1);

        // Assert 1
        assertTrue(outContent.toString().contains("Java"));


        // Act 2
        bogTitel1.etKoeb(kunde2);
        bogTitel1.etKoeb(kunde3);

        // Assert 2
        assertEquals(13, bogTitel1.getAntal());
        assertEquals(15, bogTitel2.getAntal());

        } finally {
            System.setOut(originalOut);
        }

    }

}