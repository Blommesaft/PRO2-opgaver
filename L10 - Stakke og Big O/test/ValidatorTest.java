import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest
{



    @Test
    @Order(1)
    void test_validator_canValidateBrackets()
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        Validator validator = new Validator();

        String sTrue = "(3+{5{99{*}}[23[{67}67]]})";
        String sFalse = "(}){";


        // --------------------------------------------------
        // ACT
        // --------------------------------------------------
        boolean resultTrue = validator.validateBrackets(sTrue);
        boolean resultFalse = validator.validateBrackets(sFalse);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        assertTrue(resultTrue);
        assertFalse(resultFalse);

        assertTrue(validator.validateBrackets(""));
        assertTrue(validator.validateBrackets("()"));
        assertTrue(validator.validateBrackets("({[]})"));

        assertFalse(validator.validateBrackets("("));
        assertFalse(validator.validateBrackets("]"));
        assertFalse(validator.validateBrackets("([)]"));
        assertFalse(validator.validateBrackets("(()"));
    }
}