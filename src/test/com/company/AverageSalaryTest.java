package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSalaryTest extends TestCase {

    @Test
    void average() {
        int [] input_salaries = new int[]{34, 21, 54, 6};
        assertEquals(AverageSalary.average(input_salaries), 27.5);

    }

    @Test
    void average1() {
        int [] input_salaries = new int[]{123, 456, 789, 45, 664234};
        assertEquals(AverageSalary.average(input_salaries), 456.0);

    }
}