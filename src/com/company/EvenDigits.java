package com.company;

public class EvenDigits {
    public static int findNumbers(int[] nums) {
        int numofEvenDigits = 0;
        for (int num : nums) {
            boolean numberGreaterThanTen = true;
            int digits = 0;
            while (numberGreaterThanTen) {
                num = num / 10;
                digits++;
                if (num < 1) {
                    numberGreaterThanTen = false;
                }
            }
            if (digits % 2 == 0) {
                numofEvenDigits++;
            }
        }
        return numofEvenDigits;
    }
}
