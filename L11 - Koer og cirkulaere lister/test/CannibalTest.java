import Opgave03.CircularCannibalMeal;
import Opgave03.Person;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CannibalTest {
    private CircularCannibalMeal circularCannibalMeal;

    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private Person person5;

    @BeforeEach
    void setUp() throws Exception {

        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.circularCannibalMeal = new CircularCannibalMeal();

        circularCannibalMeal.addPerson(new Person("Anna"));
        circularCannibalMeal.addPerson(new Person("Bob"));
        circularCannibalMeal.addPerson(new Person("Charlie"));

    }

    @Test
    @Order(1)
    void test_Eat_Sequence() {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        // 1. Opsætning til at læse konsol-output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Gem den originale strøm
        System.setOut(new PrintStream(outContent));


            try {

                // Act 1
                Person first = circularCannibalMeal.eatRandomPerson();
                circularCannibalMeal.printPersons();

                // Assert 1
                assertFalse(outContent.toString().contains(first.getName()));


                // Act 2
                while (circularCannibalMeal.getSize() > 0) {
                    Person eaten = circularCannibalMeal.eatNextPerson(5);
                }
                circularCannibalMeal.printPersons();

                // Assert 2
                assertTrue(outContent.toString().contains("tom"));

            } finally {
                System.setOut(originalOut);
            }
        }
    }