package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest extends TestCase {

    @Test
    void findMaxConsecutiveOnesTest1() {
        int [] inputArray = new int [] {1,1,1,0,1};
        assertEquals(3, MaxConsecutiveOnes.findMaxConsecutiveOnes(inputArray));
    }
    @Test
    void findMaxConsecutiveOnesTest2() {
        int [] inputArray = new int [] {1,1,1,1,1};
        assertEquals(5, MaxConsecutiveOnes.findMaxConsecutiveOnes(inputArray));
    }
    @Test
    void findMaxConsecutiveOnesTest3() {
        int [] inputArray = new int [] {1,0,1,0,1};
        assertEquals(1, MaxConsecutiveOnes.findMaxConsecutiveOnes(inputArray));
    }
}