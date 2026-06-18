package Opgave01;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class BilForsikringTest {

//    private BilForsikring bilForsikring;
//
//    private int alder;
//    private boolean isKvinde;
//    private int skadeFrieaer;
//
//    @BeforeEach
//    void setUp() {
//        bilForsikring = new BilForsikring();
//    }

    @Test
    void test_beregnPraemie_under_18() {

        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        int alder = 1;
        boolean isKvinde = false;
        int skadeFrieaer = 0;
        bilForsikring.setGrundpaemie(50);


        // Act
        Exception actual = assertThrows(RuntimeException.class,() ->
        bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer));


        // Assert
        String expected = "Du er for ung til at tegne en forsikring";
        assertEquals(expected, actual.getMessage());

    }

    @Test
    void test_beregnPraemie_alder_større_end_skadefri() {

        // Arrange
        BilForsikring bilForsikring = new BilForsikring();
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieaer = 19;
        bilForsikring.setGrundpaemie(50);


        // Act
        Exception actual = assertThrows(RuntimeException.class,() ->
                bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer));


        // Assert
        String expected = "Du kan ikke have kaert skadefri saelaenge";
        assertEquals(expected, actual.getMessage());

    }

//    @Test
//    void test_beregnPraemie_negativ_skadefri() {
//
//        // Arrange
//        BilForsikring bilForsikring = new BilForsikring();
//        int alder = 18;
//        boolean isKvinde = false;
//        int skadeFrieaer = -1;
//        bilForsikring.setGrundpaemie(50);
//
//
//        // Act
//        Exception actual = assertThrows(RuntimeException.class,() ->
//                bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer));
//
//
//        // Assert
//        String expected = "Antal skade frie aer skal vaere positiv";
//        assertEquals(expected, actual.getMessage());
//
//    }
//
//    @Test
//    void test_beregnPraemie_negativ_skadefri() {
//
//        // Arrange
//        BilForsikring bilForsikring = new BilForsikring();
//        int alder = 18;
//        boolean isKvinde = false;
//        int skadeFrieaer = -1;
//        bilForsikring.setGrundpaemie(50);
//
//
//        // Act
//        Exception actual = assertThrows(RuntimeException.class,() ->
//                bilForsikring.beregnPraemie(alder, isKvinde, skadeFrieaer));
//
//
//        // Assert
//        String expected = "Antal skade frie aer skal vaere positiv";
//        assertEquals(expected, actual.getMessage());
//
//    }
}