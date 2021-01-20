package sk.kosickaakademia.regex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithRegexTest {
    WithRegex withRegex;

    @BeforeEach
    void setUp() {
        withRegex = new WithRegex();
    }

    @AfterEach
    void tearDown() {
        withRegex = null;
    }

    @Test
    void compareWithRegex() {
        assertTrue(withRegex.compareWithRegex("KK888LL"));
        assertFalse(withRegex.compareWithRegex("K7999PP"));
        assertFalse(withRegex.compareWithRegex("K 999PP"));
    }

    @Test
    void isNumberCorrect() {
        assertTrue(withRegex.isNumberCorrect("+421910500268"));
        assertTrue(withRegex.isNumberCorrect("00421910500268"));
        assertTrue(withRegex.isNumberCorrect("0910500268"));
        assertFalse(withRegex.isNumberCorrect("0810500268"));
    }
}