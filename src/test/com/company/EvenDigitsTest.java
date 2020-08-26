package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitsTest extends TestCase {

    @Test
    void findNumbersTest1() {
        int [] inputArray = new int [] {12, 1234, 332, 4, 64, 12, 11111};
        assertEquals(4, EvenDigits.findNumbers(inputArray));
    }
    @Test
    void findNumbersTest2() {
        int [] inputArray = new int [] {112, 12234, 332, 4, 624, 12, 11111};
        assertEquals(1, EvenDigits.findNumbers(inputArray));
    }
    @Test
    void findNumbersTest3() {
        int [] inputArray = new int [] {1, 3, 4, 5, 0};
        assertEquals(0, EvenDigits.findNumbers(inputArray));
    }
}