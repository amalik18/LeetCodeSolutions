package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest extends TestCase {

    @Test
    void isValidTest_1() {
        assertEquals(ValidParentheses.isValid("()"), true);
    }

    @Test
    void isValidTest_2() {
        assertTrue(ValidParentheses.isValid("([{}])"));
    }

    @Test
    void isValidTest_3() {
        assertFalse(ValidParentheses.isValid("({[}])"));
    }
}