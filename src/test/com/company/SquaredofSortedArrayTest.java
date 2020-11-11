package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaredofSortedArrayTest extends TestCase {

    @Test
    void sortedSquaresTest1() {
        int [] inputArray = {-7, -6, 5, 8, 10};
        assertArrayEquals(SquaredofSortedArray.sortedSquares(inputArray), new int[]{25, 36, 49, 64, 100});
    }

    @Test
    void sortedSquaresTest2() {
        int [] inputArray = {-7,-3,2,3,11};
        assertArrayEquals(SquaredofSortedArray.sortedSquares(inputArray), new int[]{4, 9, 9, 49, 121});
    }

    @Test
    void sortedSquaresTest3() {
        int [] inputArray = {-4,-1,0,3,10};
        assertArrayEquals(SquaredofSortedArray.sortedSquares(inputArray), new int[]{0, 1, 9, 16, 100});
    }
}