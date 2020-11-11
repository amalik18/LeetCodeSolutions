package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest extends TestCase {

    @Test
    void twoSum() {
        int [] inputNums = new int[] {2, 5, 3, 7};
        assertArrayEquals(new int[]{0, 2}, TwoSums.twoSumBruteForce(inputNums, 5));
    }
}