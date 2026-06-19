package Opgave02;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {


    @Test
    @Order(1)
    void test_beregnBøde_0Dage_Barn() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,1);
        boolean voksen = false;

        // Act
        int expected = 0;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Order(2)
    void test_beregnBøde_0Dage_Voksen() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,1);
        boolean voksen = true;

        // Act
        int expected = 0;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    void test_beregnBøde_1Dag_Barn() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,2);
        boolean voksen = false;

        // Act
        int expected = 10;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Order(4)
    void test_beregnBøde_1Dag_Voksen() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,2);
        boolean voksen = true;

        // Act
        int expected = 20;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Order(5)
    void test_beregnBøde_7Dage_Barn() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,8);
        boolean voksen = false;

        // Act
        int expected = 10;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Order(6)
    void test_beregnBøde_7Dage_Voksen() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,8);
        boolean voksen = true;

        // Act
        int expected = 20;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Order(7)
    void test_beregnBøde_8Dage_Barn() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,9);
        boolean voksen = false;

        // Act
        int expected = 30;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @Order(8)
    void test_beregnBøde_8Dage_Voksen() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2026,5,1);
        LocalDate faktiskDato = LocalDate.of(2026,5,9);
        boolean voksen = true;

        // Act
        int expected = 60;
        int actual = bibliotek.beregnBøde(beregnetDato,faktiskDato,voksen);

        // Assert
        assertEquals(expected, actual);
    }


}