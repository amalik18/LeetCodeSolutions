package com.company;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentConsecutiveOnes = 0;
        int previousConsecutiveOnes = 0;
        for (int num : nums) {
            if (num != 1) {
                if (currentConsecutiveOnes > previousConsecutiveOnes) {
                    previousConsecutiveOnes = currentConsecutiveOnes;
                }
                currentConsecutiveOnes = 0;
            } else {
                currentConsecutiveOnes++;
            }
        }
        return Math.max(currentConsecutiveOnes, previousConsecutiveOnes);
    }
}
